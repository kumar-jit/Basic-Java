package DSA.BinaryTree;

public class BinaryTree_L12_ConstructTreeUsingInorderAndPreorder {
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        //Your code goes here
        return  buildTreeHelper(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int preOrderS, int preOrderE, int[]inOrder, int inOrderS, int inOrderE){

        if(preOrderS>preOrderE){
            return null;
        }
        int rootData = preOrder[preOrderS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex = 0;
        for(int i = inOrderS;i<=inOrderE;i++ ){
            if(inOrder[i] == rootData){
                rootIndex = i;
                break;
            }
        }
        BinaryTreeNode<Integer> left = buildTreeHelper(preOrder,preOrderS+1,preOrderS+1-inOrderS+rootIndex-1,inOrder,inOrderS,rootIndex-1);
        BinaryTreeNode<Integer> right = buildTreeHelper(preOrder,preOrderS+1-inOrderS+rootIndex, preOrderE, inOrder, rootIndex+1,inOrderE);

        root.left = left;
        root.right = right;

        return  root;
    }

}
