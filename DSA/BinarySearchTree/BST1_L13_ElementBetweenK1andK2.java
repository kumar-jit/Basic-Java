package DSA.BinarySearchTree;

public class BST1_L13_ElementBetweenK1andK2 {
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root == null){
            return;
        }
        if( k1 > root.data){
            elementsInRangeK1K2(root.right,k1,k2);
        }
        else if(k2 < root.data){
            elementsInRangeK1K2(root.left,k1,k2);
        }
        else{

            elementsInRangeK1K2(root.left,k1,k2);
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right,k1,k2);
        }

    }
}
