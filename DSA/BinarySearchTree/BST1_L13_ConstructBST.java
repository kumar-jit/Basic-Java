package DSA.BinarySearchTree;

public class BST1_L13_ConstructBST {

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBST(arr,0,n-1);
    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start + end)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        BinaryTreeNode<Integer> left = SortedArrayToBST(arr,start,mid-1);
        BinaryTreeNode<Integer> right = SortedArrayToBST(arr,mid+1,end);
        root.left = left;
        root.right = right;
        return root;
    }

}
