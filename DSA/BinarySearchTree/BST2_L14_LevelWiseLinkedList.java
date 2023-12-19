/*
    Level wise linkedlist
    Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.
    Input format :
    The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
    Output format :
    Each level linked list is printed in new line (elements are separated by space).
    Constraints:
    Time Limit: 1 second
    Sample Input 1:
    5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
    Sample Output 1:
    5
    6 10
    2 3
    9
 */

package DSA.BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BST2_L14_LevelWiseLinkedList {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
        // Write your code here
        ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();

        Queue<BinaryTreeNode<Integer>> storeQ = new LinkedList<>();

        if(root != null){
            storeQ.add(root);
            storeQ.add(null);
        }
        else{
            return null;
        }


        LinkedListNode<Integer> listElement = null;

        while (!storeQ.isEmpty()) {
            BinaryTreeNode<Integer> currentRoot = storeQ.poll();
            if (currentRoot == null) {
                storeQ.add(null);
                listElement = null;
                if(storeQ.size() == 1)
                    break;
                else
                    continue;

            } else {

                if (listElement == null) {
                    listElement = new LinkedListNode(currentRoot.data);
                    ans.add(listElement);
                } else {
                    LinkedListNode<Integer> temp = new LinkedListNode(currentRoot.data);
                    listElement.next = temp;
                    listElement = listElement.next;
                }

                if (currentRoot.left != null) {
                    storeQ.add(currentRoot.left);
                }

                if (currentRoot.right != null) {
                    storeQ.add(currentRoot.right);
                }
            }
        }
        return ans;
    }
}
