package com.zjc.algorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/8 22:41
 * @description : 406. 根据身高重建队列
 */
public class LeetCode406 {
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        List<int[]> res = new ArrayList<>();
        for (int[] i : people) {
            res.add(i[1], i);
        }
        return res.toArray(new int[res.size()][2]);
    }

    public static void main(String[] args) {
        int[][] people = new int[2][2];
        people[0][0] = 8;
        people[0][1] = 1;
        people[1][0] = 8;
        people[1][1] = 0;
        reconstructQueue(people);
    }
}
