package DSA.BinarySearchTree;

import java.util.HashMap;
import java.util.Map;

public class BST2_L14_PairSumInBST {
    private static HashMap<Integer,Integer> tempMap = new HashMap<>();

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        // Write your code here
        if(root == null){
            return;
        }

        // fetching left first to store all the bigger element first BCZ as per question we have to print small fast
        printNodesSumToS(root.right,s);
        int currentData = root.data;
        if(tempMap.containsKey( Math.abs(s-currentData)) ){
            System.out.println(currentData + " " + (s-currentData));
        }
        else {
            tempMap.put(currentData,1);
        }
        printNodesSumToS(root.left,s);
    }

}
