
/*
    BST to LL
    Given a BST, convert it into a sorted linked list. You have to return the head of LL.
    Input format:
    The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
    Output Format:
    The first and only line of output prints the elements of sorted linked list.
    Constraints:
    Time Limit: 1 second
    1<=n<=10^5
    Note:
    In case if you are facing any issue to solve this problem, please prefer to use the helper function.
    Sample Input 1:
    8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
 */
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
