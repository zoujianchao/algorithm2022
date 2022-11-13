package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/21 10:37
 * @description :
 */
public class LeetCode6152 {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int totalEnergy = 0;
        int totalExperience = 0;
        for (int i = 0; i < energy.length; i++) {
            totalEnergy += energy[i];
            if (experience[i] >= initialExperience) {
                totalExperience += experience[i] - initialExperience + 1;
                initialExperience += experience[i] + experience[i] - initialExperience + 1;
            } else {
                initialExperience += experience[i];
            }
        }
        if (initialEnergy - totalEnergy > 0) {
            return totalExperience;
        } else {
            return totalEnergy - initialEnergy + 1 + totalExperience;
        }
    }

    public static void main(String[] args) {
        int[] energy = {1, 4, 3, 2};
        int[] experience = {2, 6, 3, 1};
        System.out.println(minNumberOfHours(5, 3, energy, experience));
    }
}
