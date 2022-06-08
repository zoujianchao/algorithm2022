package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/8 22:19
 * @description : 860. 柠檬水找零
 */
public class LeetCode860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }

            if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                }else {
                    return false;
                }
            }

            if (bill == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                }else if (five >= 3) {
                    five-=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
