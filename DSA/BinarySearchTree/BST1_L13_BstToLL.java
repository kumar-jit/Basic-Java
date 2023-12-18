package DSA.BinarySearchTree;

public class BST1_L13_BstToLL {
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if(root == null ){
            return null;
        }
        LinkedListNode<Integer> left = constructLinkedList(root.left);
        LinkedListNode<Integer> main = new LinkedListNode(root.data);
        LinkedListNode<Integer> right = constructLinkedList(root.right);
        if(left!=null){
            LinkedListNode<Integer> temp = left;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = main;
            main.next = right;
            return left;
        }
        else{
            main.next = right;
            return main;
        }


    }
}
