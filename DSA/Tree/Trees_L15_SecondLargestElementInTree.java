/*
    Second Largest Element In Tree

    Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.
    Input format :
    Elements in level order form separated by space (as per done in class). Order is -

    Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
    Output format:
    Second Largest node data
    Sample Input 1 :
    10 3 20 30 40 2 40 50 0 0 0 0
    Sample Output 1 :
    40
 */

package DSA.Tree;

public class Trees_L15_SecondLargestElementInTree {
    static int largestElement = Integer.MIN_VALUE;
    static int secondLargestElement = largestElement;
    static TreeNode<Integer> secondLargestNode = null;
    static TreeNode<Integer> largestNode = null;



    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        if(largestNode == null){
            largestElement = root.data;
            largestNode = root;
        }
        else{
            if(root.data > largestElement){
                secondLargestElement = largestElement;
                secondLargestNode = largestNode;
                largestElement = root.data;
                largestNode = root;
            }
            if( root.data > secondLargestElement && root.data <  largestElement ){
                secondLargestElement = root.data;
                secondLargestNode = root;
            }
        }

        for(int i = 0;i<root.children.size();i++){
            findSecondLargest(root.children.get(i));
        }

        return secondLargestNode;

    }
}
