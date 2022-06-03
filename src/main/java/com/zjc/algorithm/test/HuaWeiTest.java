package com.zjc.algorithm.test;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/23 20:00
 * @description :
 */
public class HuaWeiTest {

    public static boolean equalsStrAB(String a, String b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length() != b.length()) {
            return false;
        }
        int count = 0;
        int num = 1;
        boolean flag = true;
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (count > 2) {
                return false;
            }
            if (a.charAt(i) != b.charAt(i)) {
                count++;
                sba.append(a.charAt(i));
                sbb.append(b.charAt(i));
            }
            if (i > 0 && a.charAt(i) == a.charAt(i-1)) {
                num++;
            }

        }
        if (num == a.length()) {
            return true;
        }
        if (count < 2) {
            return false;
        }

        return sba.reverse().toString().equals(sbb.toString());
    }

    public static void main(String[] args) {
        System.out.println(equalsStrAB("abcd", "adcb"));
        System.out.println(equalsStrAB("aecd", "adcb"));
        System.out.println(equalsStrAB("ab", "ab"));
        System.out.println(equalsStrAB("aa", "aa"));
        System.out.println(equalsStrAB("aba", "aba"));
    }
}
