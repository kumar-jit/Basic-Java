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
    private static void printLevelWiseAtDiffLevel(BinaryTreeNode<Integer> root) throws QueueEmptyException {
        if (root == null)
            return;
        QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<BinaryTreeNode<Integer>>();
        q.enqueue(root);
        q.enqueue(null);
        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> first = q.front();
            q.dequeue();
            if (first == null) {
                if (q.isEmpty()) {
                    break;
                }
                System.out.println();
                q.enqueue(null);
                continue;
            }
            System.out.print(first.data + " ");
            if (first.left != null) {
                q.enqueue(first.left);
            }
            if (first.right != null) {
                q.enqueue(first.right);
            }
        }
    }


    public static void main(String[] args) throws IOException, QueueEmptyException {
//        _BST1_L13_SearchInBST();    // search in BST
//        _BST1_L13_ElementBetweenK1andK2();   // Elements between K1 and K2
//        _BST1_L13_ConstructBST();   // Construct BST
//        _BST1_L13_BstToLL();    // BST To LL
//        _BST1_L13_LcaOfBST();   // LCA of BST
//        _BST1_L13_ReplaceWithSumOfGreaterNodes();   // Replace with Sum of Greater Node


//        _BST2_L14_FindPathInBST();   // Find Path in BST
//        _BST2_L14_LevelWiseLinkedList();   // Level wise linked list
//        _BST2_L14_BSTClass();   //bst CLASS
//        _BST2_L14_PairSumInBST(); //Pair Sun in a BST
        _BST2_L14_LargestBST();  // largest BST subrute
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

    public static void _BST1_L13_BstToLL() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        LinkedListNode<Integer> head = BST1_L13_BstToLL.constructLinkedList(root);
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void _BST1_L13_LcaOfBST() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(BST1_L13_LcaOfBST.getLCA(root, a, b));
    }

    public static void _BST1_L13_ReplaceWithSumOfGreaterNodes() throws IOException, QueueEmptyException {
        BinaryTreeNode<Integer> root = takeInput();
        BST1_L13_ReplaceWithSumOfGreaterNodes.replaceWithLargerNodesSum(root);
        printLevelWiseAtDiffLevel(root);
    }

    public static void _BST2_L14_BSTClass() throws IOException {
        BST2_L14_BSTClass bst = new BST2_L14_BSTClass();
        int choice, input;
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            choice = Integer.parseInt(st.nextToken());
            switch (choice) {
                case 1:
                    input = Integer.parseInt(st.nextToken());
                    bst.insert(input);
                    break;
                case 2:
                    input = Integer.parseInt(st.nextToken());
                    bst.remove(input);
                    break;
                case 3:
                    input = Integer.parseInt(st.nextToken());
                    System.out.println(bst.search(input));
                    break;
                default:
                    bst.printTree();
                    break;
            }

        }
    }

    public static void _BST2_L14_PairSumInBST() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        int s = Integer.parseInt(br.readLine());
        BST2_L14_PairSumInBST.printNodesSumToS(root,s);
    }
    public static void _BST2_L14_LargestBST() throws IOException {
        BinaryTreeNode<Integer> root = takeInput();
        System.out.println(BST2_L14_LargestBST.largestBSTSubtree(root));
    }


}