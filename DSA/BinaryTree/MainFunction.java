package DSA.BinaryTree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

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

// -------------------------------------------------------------
//----------------- Utility Class ------------------------------
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Pair {
    int[] preOrder;
    int[] inOrder;

    public Pair(int[] preOrder, int[] inOrder) {
        this.preOrder = preOrder;
        this.inOrder = inOrder;
    }

}


// -------------------------------------------------------------
//--------------------------------------------------------------
public class MainFunction {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//----------------------------------  BinaryTree_L12_PrintLevelWise
    public static BinaryTreeNode<Integer> takeInputBinaryTree_L12_PrintLevelWise() throws NumberFormatException, IOException {
        QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(leftChildData != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if(rightChildData != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }



    // -------------------------- BinaryTree_L12_ConstructTreeUsingInorderAndPreorder
    private static Pair takeInputBinaryTree_L12_ConstructTreeUsingInorderAndPreorder() throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine().trim());

        int pre[] = new int[n];
        int in[] = new int[n];

        String[] preOrder = br.readLine().trim().split(" ");
        String[] inOrder = br.readLine().trim().split(" ");


        for (int i = 0; i < n; i++) {
            pre[i] = Integer.parseInt(preOrder[i].trim());
            in[i] = Integer.parseInt(inOrder[i].trim());
        }

        return new Pair(pre, in);

    }

    public static void printLevelWiseBinaryTree_L12_ConstructTreeUsingInorderAndPreorder(BinaryTreeNode<Integer> root) {

        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);

        while(!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();


            if (frontNode == null) {
                System.out.println();

                if (!pendingNodes.isEmpty()) {
                    pendingNodes.add(null);
                }

            } else {
                System.out.print(frontNode.data + " ");

                if (frontNode.left != null) {
                    pendingNodes.add(frontNode.left);
                }

                if (frontNode.right != null) {
                    pendingNodes.add(frontNode.right);
                }
            }

        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        // Take Input for BinaryTree_L12_PrintLevelWise
        /*
            BinaryTreeNode<Integer> root = takeInputBinaryTree_L12_PrintLevelWise();
            BinaryTree_L12_PrintLevelWise.printLevelWise(root);

         */

        // Run BinaryTree_L12_ConstructTreeUsingInorderAndPreorder
            Pair input = takeInputBinaryTree_L12_ConstructTreeUsingInorderAndPreorder();
            int[] preOrder = input.preOrder;
            int[] inOrder = input.inOrder;
            BinaryTreeNode<Integer> root = BinaryTree_L12_ConstructTreeUsingInorderAndPreorder.buildTree(preOrder, inOrder);
            printLevelWiseBinaryTree_L12_ConstructTreeUsingInorderAndPreorder(root);
    }
}
