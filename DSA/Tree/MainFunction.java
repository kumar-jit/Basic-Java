package DSA.Tree;

import java.util.ArrayList;
import java.util.Scanner;

class QueueEmptyException extends Exception {

}

class QueueUsingLL<T> {

    class Node<T> {
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public T front() throws QueueEmptyException{
        if(size == 0){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }

        return head.data;
    }


    public void enqueue(T element){
        Node<T> newNode = new Node<T>(element);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() throws QueueEmptyException{
        if(head == null){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        if(head == tail){
            tail = null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}

class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}

public class MainFunction {

    static Scanner s = new Scanner(System.in);

    public static TreeNode<Integer> takeInputLevelWise(){
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
        int rootData = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
                int numChild = s.nextInt();
                for(int i = 0 ; i < numChild; i++){
                    int currentChild = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
                    pendingNodes.enqueue(childNode);
                    currentNode.children.add(childNode);
                }
            } catch (QueueEmptyException e) {
            }
        }
        return root;
    }

    public static void printTreeLevelWise(TreeNode<Integer> root){
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
        pendingNodes.enqueue(root);
        pendingNodes.enqueue(null);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
                if(currentNode==null){
                    System.out.println();
                    if(!pendingNodes.isEmpty()){
                        pendingNodes.enqueue(null);
                        continue;
                    }else{
                        break;
                    }
                }
                System.out.print(currentNode.data+" ");
                int numChild = currentNode.children.size();
                for(int i = 0 ; i < numChild; i++){
                    pendingNodes.enqueue(currentNode.children.get(i));
                }

            } catch (QueueEmptyException e) {
            }
        }
    }

    public static void main(String[] args) {
//        _Trees_L15_SumOfAllNodes();     //Sum of all nodes
//        _Trees_L15_CountLeafNodes();    //Count leaf nodes
//        _Trees_L15_PostOrderTraversal();
//        _Trees_L15_CheckOfGenericTreeContainElement(); // Check if generic tree contain element x
//        _Trees_L15_NodeHavingSumOfChildrenAndNodeIsMax();   // Node having sum of children and node is max
//        _Trees_L15_StructurallyIdentical();     // Structurally identical
//        _Trees_L15_NextLargerElement();      // Next larger element
//        _Trees_L15_SecondLargestElementInTree();    // Second Largest Element In Tree
//        _Trees_L15_ReplaceNodeWithDepth();      //Replace node with depth
//        _Trees_L15_FindHeight();    // Find Height
//        _Trees_L15_NumberOfNodesGreaterThanX();     // find node greater than x
        _Trees_L15_PrintTreeLevelWise();

    }


    public static void _Trees_L15_SumOfAllNodes() {
        TreeNode<Integer> root =  takeInputLevelWise();
        System.out.println(Trees_L15_SumOfAllNodes.sumOfAllNode(root));
    }
    public static void _Trees_L15_CountLeafNodes() {
        TreeNode<Integer> root =  takeInputLevelWise();
        System.out.println(Trees_L15_CountLeafNodes.countLeafNodes(root));
    }

    public static void _Trees_L15_PostOrderTraversal() {
        TreeNode<Integer> root = takeInputLevelWise();
        Trees_L15_PostOrderTraversal.printPostOrder(root);

    }

    public static void _Trees_L15_CheckOfGenericTreeContainElement() {
        int x = s.nextInt();
        TreeNode<Integer> root =  takeInputLevelWise();
        System.out.println(Trees_L15_CheckOfGenericTreeContainElement.checkIfContainsX(root, x));
    }

    public static void _Trees_L15_NodeHavingSumOfChildrenAndNodeIsMax() {
        TreeNode<Integer> root =  takeInputLevelWise();
        TreeNode<Integer> ans = Trees_L15_NodeHavingSumOfChildrenAndNodeIsMax.maxSumNode(root);
        if(ans == null){
            System.out.println(Integer.MIN_VALUE);
        }else{
            System.out.println(ans.data);
        }

    }

    public static void _Trees_L15_StructurallyIdentical() {
        TreeNode<Integer> root1 =  takeInputLevelWise();
        TreeNode<Integer> root2 = takeInputLevelWise();
        System.out.println(Trees_L15_StructurallyIdentical.checkIdentical(root1, root2));
    }

    public static void _Trees_L15_NextLargerElement() {
        int n = s.nextInt();
        TreeNode<Integer> root =  takeInputLevelWise();

        TreeNode<Integer> ans = Trees_L15_NextLargerElement.findNextLargerNode(root, n);
        if(ans == null){
            System.out.println(Integer.MIN_VALUE);
        }else{
            System.out.println(ans.data);
        }

    }
    public static void _Trees_L15_SecondLargestElementInTree() {
        TreeNode<Integer> root =  takeInputLevelWise();
        TreeNode<Integer> ans = Trees_L15_SecondLargestElementInTree.findSecondLargest(root);
        if(ans == null){
            System.out.println(Integer.MIN_VALUE);
        }else{
            System.out.println(ans.data);
        }
    }

    public static void _Trees_L15_ReplaceNodeWithDepth() {
        TreeNode<Integer> root =  takeInputLevelWise();
        Trees_L15_ReplaceNodeWithDepth.replaceWithDepthValue(root);
        printTreeLevelWise(root);
    }

    public static void _Trees_L15_FindHeight() {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(Trees_L15_FindHeight.getHeight(root));

    }
    public static void _Trees_L15_NumberOfNodesGreaterThanX() {
        int x = s.nextInt();
        TreeNode<Integer> root =  takeInputLevelWise();
        System.out.println(Trees_L15_NumberOfNodesGreaterThanX.numNodeGreater(root, x));
    }

    public static void _Trees_L15_PrintTreeLevelWise() {
        TreeNode<Integer> root =  takeInputLevelWise();
        Trees_L15_PrintTreeLevelWise.printLevelWise(root);
    }


}
