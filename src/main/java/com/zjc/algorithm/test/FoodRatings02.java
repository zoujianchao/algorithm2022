package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 11:33
 * @description :
 */
public class FoodRatings02 {
    String[] foods1;
    String[] cuisines1;
    int[] ratings1;
    public FoodRatings02(String[] foods, String[] cuisines, int[] ratings) {
        int length = foods.length;
        cuisines1 = new String[length];
        ratings1 = new int[length];
        foods1 = new String[length];
        for (int i = 0; i < foods.length; i++) {
            foods1[i] = foods[i];
            cuisines1[i] = cuisines[i];
            ratings1[i] = ratings[i];
        }
    }

    public void changeRating(String food, int newRating) {
        for (int i = 0; i < foods1.length; i++) {
            if (food.equals(foods1[i])) {
                ratings1[i] = newRating;
                break;
            }
        }
    }

    public String highestRated(String cuisine) {
        int max = 0;
        String f = "zzzzzzzzzzz";
        for (int i = 0; i < cuisines1.length; i++) {
            if (cuisine.equals(cuisines1[i])) {
                if (ratings1[i] > max) {
                    max = ratings1[i];
                    f = foods1[i];
                }
                if (ratings1[i] == max) {
                    if (foods1[i].compareTo(f) < 0) {
                        f = foods1[i];
                    }
                }
            }
        }
        return f;
    }
}
