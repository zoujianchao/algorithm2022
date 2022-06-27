package com.zjc.algorithm.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/25 22:24
 * @description : 1002. 查找共用字符
 */
public class LeetCode1002 {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        if (words.length == 0) {
            return res;
        }

        char[] arr1 = new char[26];
        for (int i = 0; i < words[0].length(); i++) {
            arr1[words[0].charAt(i) - 'a']++;
        }

        for (String word : words) {
            char[] arr2 = new char[26];
            for (int i = 0; i < word.length(); i++) {
                arr2[word.charAt(i) - 'a']++;
            }

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (char) Math.min(arr1[i], arr2[i]);
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            while (arr1[i] != 0) {
                char a = (char) (i + 'a');
                res.add(String.valueOf(a));
                arr1[i]--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        List<String> sList2 = new ArrayList<String>();
        sList.add("1");
        sList.add("1");
        sList.add("3");
        sList.add("4");

        sList2.add("1");
        sList2.add("1");
        sList2.add("5");

        sList.retainAll(sList2);

        for(String s : sList){
            System.out.println(s);
        }
    }

}
