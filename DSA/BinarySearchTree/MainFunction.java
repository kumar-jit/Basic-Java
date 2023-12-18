package DSA.BinarySearchTree;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.StringTokenizer;

class QueueEmptyException extends Exception {
}

class QueueUsingLL<T> {

    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public T front() throws QueueEmptyException {
        if (size == 0) {
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }

        return head.data;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<T>(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() throws QueueEmptyException {
        if (head == null) {
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        if (head == tail) {
            tail = null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

public class MainFunction {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static BinaryTreeNode<Integer> takeInput() throws IOException {
        st = new StringTokenizer(br.readLine());
        int rootData = Integer.parseInt(st.nextToken());
        if (rootData == -1) {
            return null;
        }
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            int leftChildData = Integer.parseInt(st.nextToken());
            if (leftChildData != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }
            int rightChildData = Integer.parseInt(st.nextToken());
            if (rightChildData != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }
        return root;
    }

    private static void print(LinkedListNode<Integer> temp)
    {
        while(temp != null){
            System.out.print(temp.data + " ") ;
            temp = temp.next;
        }
        System.out.println();
    }

    private static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) throws IOException {
//        _BST1_L13_SearchInBST();    // search in BST
//        _BST1_L13_ElementBetweenK1andK2();   // Elements between K1 and K2
        _BST1_L13_ConstructBST();   // Construct BST


//        _BST2_L14_FindPathInBST();   // Find Path in BST
//        _BST2_L14_LevelWiseLinkedList();   // Level wise linked list
    }


    public static void  _BST2_L14_FindPathInBST() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        int k = Integer.parseInt(br.readLine());
        ArrayList<Integer> output = BST2_L14_FindPathInBST.getPath(root, k);
        if(output != null) {
            for(int i : output) {
                System.out.print(i+" ");
            }
        }
    }

    public static void _BST2_L14_LevelWiseLinkedList() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        ArrayList<LinkedListNode<Integer>> output = BST2_L14_LevelWiseLinkedList.constructLinkedListForEachLevel(root);
        if(output!=null)
        {
            for(LinkedListNode<Integer> head : output){
                print(head);

            }
        }
    }

    public static void _BST1_L13_SearchInBST() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        int k = Integer.parseInt(br.readLine());
        System.out.println(BST1_L13_SearchInBST.searchInBST(root,k));
    }

    public static void _BST1_L13_ElementBetweenK1andK2() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        st = new StringTokenizer(br.readLine());
        int k1 = Integer.parseInt(st.nextToken());
        int k2 = Integer.parseInt(st.nextToken());
        BST1_L13_ElementBetweenK1andK2.elementsInRangeK1K2(root, k1, k2);
    }

    public static void _BST1_L13_ConstructBST() throws IOException {
        st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int arr[] = new int[len];
        if(len>0)
        {
            st = new StringTokenizer(br.readLine());
        }
        for(int i=0;i<len;i++)
        {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        BinaryTreeNode<Integer> ans = BST1_L13_ConstructBST.SortedArrayToBST(arr, len);
        preOrder(ans);
    }


}