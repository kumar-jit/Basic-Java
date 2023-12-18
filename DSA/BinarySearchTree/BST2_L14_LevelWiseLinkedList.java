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
