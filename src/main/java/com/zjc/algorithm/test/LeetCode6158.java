package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/21 0:02
 * @description :
 */
public class LeetCode6158 {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int[] shift : shifts) {
            int direction = shift[2];
            int start = shift[0];
            int end = shift[1];
            if (direction == 0) {
                for (int j = 0; j < n; j++) {
                    if (j < start) {
                        continue;
                    }
                    if (j <= end) {
                        if (chars[j] == 'a') {
                            chars[j] = 'z';
                        } else {
                            chars[j] = (char) (chars[j] - 1);
                        }
                    }else {
                        break;
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j < start) {
                        continue;
                    }
                    if (j <= end) {
                        if (chars[j] == 'z') {
                            chars[j] = 'a';
                        } else {
                            chars[j] = (char) (chars[j] + 1);
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println((char) ('b' - 1));
    }
}
