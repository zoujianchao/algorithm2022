package com.zjc.algorithm.test;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 11:05
 * @description :
 */
public class FoodRatings {
    Map<String, String> mapFC;
    Map<String, Integer> mapFR;
    Map<String, TreeSet<String>> mapCF;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        mapFC = new HashMap<>();
        mapFR = new HashMap<>();
        mapCF = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            mapFC.put(foods[i], cuisines[i]);
            mapFR.put(foods[i], ratings[i]);
            TreeSet<String> setF = mapCF.getOrDefault(cuisines[i], new TreeSet<>((o1, o2) -> {
                if (Objects.equals(mapFR.get(o1), mapFR.get(o2))) {
                    return o1.compareTo(o2);
                }
                return mapFR.get(o2) - mapFR.get(o1);
            }));
            setF.add(foods[i]);
            mapCF.put(cuisines[i], setF);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = mapFC.get(food);
        TreeSet<String> treeSet = mapCF.get(cuisine);
        treeSet.remove(food);
        mapFR.put(food, newRating);
        treeSet.add(food);
        mapCF.put(cuisine, treeSet);
    }

    public String highestRated(String cuisine) {
        return mapCF.get(cuisine).first();
    }

    public static void main(String[] args) {
        String str1 = "xxx";
        String str2 = "zzzzz";
        System.out.println(str1.compareTo(str2));
    }
}
