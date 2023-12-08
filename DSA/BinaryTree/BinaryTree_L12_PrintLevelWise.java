package DSA.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree_L12_PrintLevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode<Integer>> tempStore = new LinkedList<>();
        tempStore.add(root);
        while (!tempStore.isEmpty()) {
            BinaryTreeNode<Integer> currentRoot = tempStore.poll();
            System.out.print(currentRoot.data + ":");
            if (currentRoot.left != null) {
                tempStore.add(currentRoot.left);
                System.out.print("L:" + currentRoot.left.data + ",");
            } else {
                System.out.print("L:-1,");
            }

            if (currentRoot.right != null) {
                tempStore.add(currentRoot.right);
                System.out.print("R:" + currentRoot.right.data);
            } else {
                System.out.print("R:-1");
            }
            System.out.println();
        }

    }
}
