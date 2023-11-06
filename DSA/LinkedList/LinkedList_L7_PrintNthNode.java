package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_L7_PrintNthNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = new Node<>(10);
        Node<Integer> headCopy = head;
        int length = sc.nextInt();
        for(int i = 0;i<length;i++){
            Node<Integer> temp = new Node<>(sc.nextInt());
            head.next = temp;
            head = temp;
        }
        printIthNode(headCopy,sc.nextInt());
    }

    public static void printIthNode(Node<Integer> head, int i){
        int count = 0;

        while (head!=null){
            // checking index
            if(count==i)
                System.out.println(head.data);
            // calculating index
            count++;
            head = head.next;
        }
    }
}
