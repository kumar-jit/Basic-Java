/*
    Pair sum in a BST
    Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. You can use extra space of the order of O(log n).
    Note:
    1. Assume BST contains all unique elements.
    2. In a pair, print the smaller element first.
    Input Format :
    The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
    The following line of input contains an integer, that denotes the value of S.
    Output format:
    You have to print each pair in a different line (pair elements separated by space). The order of different pairs, to be printed, does not matter.
    Constraints:
    Time Limit: 1 second
    Sample Input 1:
    8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
    12
    Sample Output 1:
    2 10
    5 7
 */


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
