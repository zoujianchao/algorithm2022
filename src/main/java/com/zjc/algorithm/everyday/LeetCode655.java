package com.zjc.algorithm.everyday;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/22 22:21
 * @description :
 */
public class LeetCode655 {
    public List<List<String>> printTree(TreeNode root) {
        //题中树的 高度为 height ，矩阵的行数 m 应该等于 height + 1 矩阵的列数 n 应该等于 2^(height+1) - 1 是基于根节点为第0层
        //而我得到的height是将根结点作为第一层，故将得到的height - 1 顺应题意
        int height = rootHeight(root) - 1;
        //定义行和列
        int m = height + 1;
        int n = (int) Math.pow(2, height + 1) - 1;
        String[][] res = new String[m][n];
        //先把每格都填成""
        for (int i = 0; i < m; i++) {
            Arrays.fill(res[i], "");
        }
        //按题意，放子节点，父子节点的位置关系，题目已经给了公式了
        //设某节点位置res[r][c] ，将其左子节点放置在 res[r+1][c-2^(height-r-1)] ，右子节点放置在 res[r+1][c+2^(height-r-1)]
        //那么根据节点位置，就能放置好子节点，这里直接层序遍历各节点，依次弹出节点并记录弹出节点的子节点位置

        //用map关联节点及节点在数组位置:<当前节点,当前节点在数组的位置arr>，arr[0]表示行，arr[1]表示列
        Map<TreeNode, int[]> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        map.put(root, new int[]{0, (n - 1) / 2});  //根节点位置公式，按照题目给出的
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                TreeNode treeNode = queue.poll();
                size--;
                //拿到当前节点的位置信息(父节点)
                int[] fatherPosition = map.get(treeNode);
                int fatherRow = fatherPosition[0];
                int fatherCol = fatherPosition[1];
                //放入数组
                res[fatherRow][fatherCol] = String.valueOf(treeNode.val);
                //再根据父节点位置，记录好子节点位置
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                    //按照题目给出的左孩子位置公式
                    map.put(treeNode.left, new int[]{fatherRow + 1, fatherCol - (int) Math.pow(2, height - fatherRow - 1)});
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                    //按照题目给出的右孩子位置公式
                    map.put(treeNode.right, new int[]{fatherRow + 1, fatherCol + (int) Math.pow(2, height - fatherRow - 1)});
                }
            }
        }
        //最后将二维数组转成二维集合List返回即可
        List<List<String>> bigList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<String> smallList = Arrays.asList(res[i]);
            bigList.add(smallList);
        }
        return bigList;
    }

    private int rootHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(rootHeight(root.left) + 1, rootHeight(root.right) + 1);
    }
}
