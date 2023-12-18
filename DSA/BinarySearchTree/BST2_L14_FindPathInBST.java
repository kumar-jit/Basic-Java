package DSA.BinarySearchTree;

import java.util.ArrayList;

public class BST2_L14_FindPathInBST {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){

        // ---- for binary tree
            /*
            if(root == null){
                return null;
            }
            if(root.data == data){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(root.data);
                return ans;
            }
            ArrayList<Integer> left = getPath(root.left,data);
            if(left!=null){
                left.add(root.data);
                return left;
            }
            ArrayList<Integer> right = getPath(root.right,data);
            if(right!=null){
                right.add(root.data);
                return right;
            }
            return null;
            */

        // --- BST tree
        if(root == null){
            return null;
        }
        ArrayList<Integer> temp = null;
        if(root.data == data){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(root.data);
            return ans;
        }
        else if(root.data > data){
            temp = getPath(root.left,data);
        }
        else{
            temp = getPath(root.right,data);
        }

        if(temp!=null){
            temp.add(root.data);
            return temp;
        }
        else{
            return null;
        }



    }
}
