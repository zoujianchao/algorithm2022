package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/2
 * @description : 93.复原IP地址
 */
public class LeetCode93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        if (s.length() > 12 || s.length() < 4) {
            return res;
        }
        backtracking(s, 0, 0, res, list);
        
        return res;
    }
    
    private void backtracking(String s, int startIndex, int level, List<String> res, LinkedList<String> list) {
        if (level == 4) {
            res.add(String.join(".", list));
            return;
        }
        
        for (int i = startIndex; i < s.length(); i++) {
            //每一次分割之后，对剩余字符长度是否合理进行判断，剪枝操作，优化运行速度
            //比如字符串还剩10个，但是只剩3段ip了，这里就不用继续回溯了，必错
            if ((s.length() - i - 1) > 3 * (3 - level)) {
                continue;
            }
            if (!isValid(s.substring(startIndex, i + 1))) {
                break;
            }
            list.add(s.substring(startIndex, i + 1));
            backtracking(s, i + 1, level + 1, res, list);
            list.removeLast();
        }
    }
    
    private boolean isValid(String s) {
        if (s.charAt(0) == '0' && s.length() > 1) {
            return false;
        }
        
        if (s.length() > 4) {
            return false;
        }
        
        if (Integer.parseInt(s) > 255) {
            return false;
        }
        
        return true;
    }
}
