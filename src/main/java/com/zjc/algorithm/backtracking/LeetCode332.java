package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/6 21:33
 * @description : 332. 重新安排行程
 */
public class LeetCode332 {
    boolean find = false;
    public List<String> findItinerary(List<List<String>> tickets) {
        //res记录路线, list存所有路线
        List<String> res = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();
        //used数组用于标记同一树枝不能重复使用！即不能重复使用一张票
        boolean[] used = new boolean[tickets.size()];

        //先按字典序从小到大排列降落地
        tickets.sort((Comparator.comparing(o -> o.get(1))));
        res.add("JFK");
        backtracking(tickets, "JFK", used, list, res);
        return list.get(0);
    }

    private void backtracking(List<List<String>> tickets, String outset, boolean[] used, List<List<String>> list, List<String> res) {
        //算个小剪枝吧，找到一条就行
        if (find) {
            return;
        }
        //因为这些航班肯定会有一条路线是正确的
        //所以我们加入path的size如果等于tickets.size()+1说明我们找到路线了
        if (res.size() == tickets.size() + 1) {
            find = true;
            list.add(new ArrayList<>(res));
            return;
        }
        for (int i = 0; i < tickets.size(); i++) {
            //如果出发地和上一个的降落地相同 并且 同一条路线中没有重复使用一张票
            if (tickets.get(i).get(0).equals(outset) && !used[i]) {
                //标记该票已经使用过
                used[i] = true;
                res.add(tickets.get(i).get(1));
                //把现在的降落地加入递归函数
                backtracking(tickets, tickets.get(i).get(1), used, list, res);
                //回溯！ 该票标记为未使用 路线中移除该票
                used[i] = false;
                res.remove(res.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<String> res1 = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();
        res1.add("MUC");
        res1.add("LHR");
        list.add(res1);
        List<String> res2 = new ArrayList<>();
        res2.add("JFK");
        res2.add("MUC");
        list.add(res2);
        List<String> res3 = new ArrayList<>();
        res3.add("SFO");
        res3.add("SJC");
        list.add(res3);
        List<String> res4 = new ArrayList<>();
        res4.add("LHR");
        res4.add("SFO");
        list.add(res4);

        System.out.println(list);
        list.sort(Comparator.comparing(o -> o.get(1)));
        System.out.println(list);
    }
}
