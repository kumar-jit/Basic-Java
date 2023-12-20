/*
    BST Class
    Implement the BST class which includes following functions -
    1. insert -
    Given an element, insert that element in the BST at the correct position. If element is equal to the data of the node, insert it in the left subtree.
    2. search
    Given an element, find if that is present in BST or not. Return true or false.
    3. delete -
    Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.
    4. printTree (recursive) -
    Print the BST in in the following format -
    For printing a node with data N, you need to follow the exact format -
    N:L:x,R:y
    where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.
    There is no space in between.
    You need to print all nodes in the recursive format in different lines.

 */

package DSA.BinarySearchTree;


public class BST2_L14_BSTClass {
    BinaryTreeNode<Integer> root = null;

    public void insert(int data) {
        //Implement the insert() function
        _insertHelper(root,data);
    }
    private void _insertHelper(BinaryTreeNode<Integer> node,int data){
        if(root == null){
            root = new BinaryTreeNode<>(data);
            return;
        }
        if(node.data < data){
            if(node.right == null){
                node.right = new BinaryTreeNode<>(data);
                return;
            }
            _insertHelper(node.right,data);
        }
        else {
            if(node.left == null){
                node.left = new BinaryTreeNode<>(data);
                return;
            }
            _insertHelper(node.left,data);
        }

    }

    public void remove(int data) {
        //Implement the remove() function
        root = _removeHelper(root,data);
    }

    private BinaryTreeNode<Integer> _removeHelper(BinaryTreeNode<Integer> node,int data){
        if(node == null || (node.left == null && node.right == null && node.data == data)){
            return null;
        }

        if(data > node.data){
            node.right =  _removeHelper(node.right,data);
            return node;
        }
        else if(data < node.data){
            node.left = _removeHelper(node.left,data);
            return node;
        }
        else{
            // if Root has only right
            if(node.left == null ){
                return node.right;
            }
            // if Root has only left
            else if (node.right == null) {
                return node.left;
            }
            // if Root has both child
            else {
                // if root has both child then we took the right smallest child and make it root
                // we can use max element from left also but some case root and left data cane be same and that violet the BST rule
                BinaryTreeNode<Integer> minNode = _findSmallestOnRightAndDelete(node.right);    // finding the smallest from right tree

                // joining the left child of root to the smallest node
                minNode.left = node.left;

                // checking if the right child is NOT the smallest among right tree
                // if right child of the root is smallest then we don't need to connect right tree again because its already have the connection
                if(!minNode.equals(node.right)){
                    minNode.right = node.right;  // joining the right child of root to the smallest node
                }
                // returning the updated root
                return minNode;
            }
        }
    }


    private BinaryTreeNode<Integer> _findSmallestOnRightAndDelete(BinaryTreeNode<Integer> node){
        /*
         * purpose : this function help to find the smallest data from tree
         * logic : as we in a BST tree most left node is the smallest among all tree. So we use recursion to reach that node.
         *         after getting the smallest node we have to delete the smallest node. so we travel till root of the leaf left node.
         *         if root has have left child
         *          then make the root left null and return the most left node
         *         else
         *          return the root
         */

        if(node == null){
            return node;
        }

        // finding for most left node root
        if(node.left != null && node.left.left == null){
            BinaryTreeNode<Integer> temp = node.left;
            node.left = null;
            return temp;
        }
        // if root have no left child
        if(node.left == null){
            return node;
        }
        return _findSmallestOnRightAndDelete(node.left);
    }

    public void printTree() {
        //Implement the printTree() function
        _printTreeHelper(root);
    }

    private static void _printTreeHelper(BinaryTreeNode<Integer> node){
        if(node == null){
            return;
        }
        System.out.print(node.data+":");
        if(node.left != null){
            System.out.print("L:"+node.left.data+",");
        }
        if(node.right != null){
            System.out.print("R:"+node.right.data);
        }
        System.out.println();
        _printTreeHelper(node.left);
        _printTreeHelper(node.right);
    }

    public boolean search(int data) {
        //Implement the search() function
        return _searchHelp(root,data);
    }
    private boolean _searchHelp(BinaryTreeNode<Integer> node,int data){
        if(node == null){
            return false;
        }

        if(node.data == data){
            return true;
        }
        else if(data > node.data){
            return _searchHelp(node.right,data);
        }
        else{
            return _searchHelp(node.left,data);
        }
    }  
    
}
