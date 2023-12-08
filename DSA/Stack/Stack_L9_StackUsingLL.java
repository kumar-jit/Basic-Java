package DSA.Stack;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

// ------------------ the Answer --------------------------
class Stack {
    //Define the data members
    private Node head;
    private int size = 0;


    public Stack() {
        //Implement the Constructor
        head = null;
    }
    /*----------------- Public Functions of Stack -----------------*/
    public int getSize() {
        //Implement the getSize() function
        return size;
    }
    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }
    public void push(int element) {
        //Implement the push(element) function
        size++;
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
    }
    public int pop() {
        //Implement the pop() function
        if(size==0)
            return -1;
        size--;
        int popedValue = head.data;
        head = head.next;
        return popedValue;
    }
    public int top() {
        //Implement the top() function
        if(head==null)
            return -1;
        return head.data;
    }
}

// ------------------ END of Answer --------------------------
public class Stack_L9_StackUsingLL {
    //Define the data members
    public static void main(String[] args) {

    }
}
