/*
    Node having sum of children and node is max
    Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
    Input format :

    Line 1 : Elements in level order form separated by space (as per done in class). Order is -

    Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

    Output format : Node with maximum sum.

    Sample Input 1 :
    5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
    Representation of input


    Sample Output 1 :
    1
    Explanation
    Sum of node 1 and it's child (15) is maximum among all the nodes, so the output for this is 1.
 */


package DSA.Tree;

public class Trees_L15_NodeHavingSumOfChildrenAndNodeIsMax {

    static int maxSum = Integer.MIN_VALUE;
    static TreeNode<Integer> maxNode = null;

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here

        int sum = 0;
        for(int i = 0;i<root.children.size();i++){
            sum += root.children.get(i).data;
            maxSumNode(root.children.get(i));
        }
        sum += root.data;
        if(sum > maxSum){
            maxSum = sum;
            maxNode = root;
        }

        return maxNode;
    }
}
