/*
    Largest BST
    Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree. You have to return the height of largest BST.
    Note :
    The binary tree will be consisting of only unique elements.
    Input format :
    The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
    Output format:
    The first and only line of output contains the height of the largest BST.
    Constraints:
    1 ≤ Number of nodes ≤ 10^5
    1 ≤ Data of a node ≤ 10^6
    Time Limit: 1 second
    Sample Input 1:
    5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
    Sample Output 1:
    2
 */


package DSA.BinarySearchTree;

class moreTreeDetails {
    int minValue;
    int maxValue;

    boolean isTree;
    int height;
     public moreTreeDetails(){
         isTree = true;
         height = 1;
     }
}
public class BST2_L14_LargestBST {

    static private int maxLength = 0;
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        largestBSTSubtreeHelper(root);

        return maxLength;
    }

    private static moreTreeDetails largestBSTSubtreeHelper(BinaryTreeNode<Integer> root){
        /*
         *  Logic : for every recursive call returning if the subtree is proper BST and max and min value of subtree.
         *          after getting left and right subtree information checking with the root for BST. and if it BST then updating the max height
         */

        // if root null return null
        if( root == null){
            return null;
        }

        // getting left subtree information
        moreTreeDetails leftTree = largestBSTSubtreeHelper(root.left);

        // getting right subtree information
        moreTreeDetails rightTree = largestBSTSubtreeHelper(root.right);

        // creating return object
        moreTreeDetails currentTree = new moreTreeDetails();

        // if node is leaf node then making max and min same
        if(leftTree == null && rightTree == null){
            currentTree.maxValue = root.data;
            currentTree.minValue = root.data;

            maxLength = Math.max(maxLength,currentTree.height);
        }
        // if left tree is null checking Root node making proper BST with the right subtree or not
        else if(leftTree == null){
            if(rightTree.isTree){
                if(rightTree.minValue >= root.data){
                    currentTree.maxValue = rightTree.maxValue;
                    currentTree.minValue = root.data;
                    currentTree.height += rightTree.height;

                    maxLength = Math.max(maxLength,currentTree.height);
                }
                else {
                    currentTree.isTree = false;
                }
            }
        }
        // if right subtree is null then checking Root node making proper BST with left tree or not
        else if(rightTree == null){
            if(leftTree.isTree){
                if(leftTree.maxValue < root.data){
                    currentTree.maxValue = root.data;
                    currentTree.minValue = leftTree.minValue;
                    currentTree.height += leftTree.height;

                    maxLength = Math.max(maxLength,currentTree.height);
                }
                else{
                    currentTree.isTree = false;
                }

            }
        }
        // if both left and right sib tree present checking for the root.
        else{
            if(leftTree.isTree && rightTree.isTree){
                if(root.data > leftTree.maxValue && root.data <= rightTree.minValue){
                    currentTree.maxValue = rightTree.maxValue;
                    currentTree.minValue = leftTree.minValue;
                    currentTree.height += Math.max(leftTree.height,rightTree.height);

                    maxLength = Math.max(maxLength,currentTree.height);
                }
                else{
                    currentTree.isTree = false;
                }

            }

        }
        return currentTree;
    }
}
