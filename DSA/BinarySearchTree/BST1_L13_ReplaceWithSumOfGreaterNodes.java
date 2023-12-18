package DSA.BinarySearchTree;

public class BST1_L13_ReplaceWithSumOfGreaterNodes {
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        // Write your code here
        replaceWithLargerNodesSum(root,0);
    }
    public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root,int rootSum){
        if(root == null){
            return 0;
        }
        int rightSum = replaceWithLargerNodesSum(root.right,rootSum);
        // if rightNode-sum and rootNode-sum both not zero then its left side node. so we need only max of (leftNode-sum, RootNode-Sum)
        int currentSum = Integer.max(rootSum,rightSum) + root.data;
        root.data = currentSum;
        int leftSum = replaceWithLargerNodesSum(root.left,currentSum);
        if(leftSum == 0){
            return currentSum;
        }
        return leftSum;
    }
}
