package com.zjc.algorithm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/7 11:07
 * @description :
 */
public class LeetCode6139 {
    public static int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<List<Integer>> reach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            reach.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            reach.get(x).add(y);
            reach.get(y).add(x);
        }

        boolean[] visited = new boolean[n];
        for (int k : restricted) {
            visited[k] = true;
        }
        List<Integer> queue = new ArrayList<>();
        queue.add(0);
        visited[0] = true;
        int f = 0;
        while (f < queue.size()) {
            int x = queue.get(f);
            for (int j : reach.get(x)) {
                if (!visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
            f++;
        }
        return queue.size();
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}};
        int[] restricted = {4, 5};
        System.out.println(reachableNodes(7, edges, restricted));
    }
}
