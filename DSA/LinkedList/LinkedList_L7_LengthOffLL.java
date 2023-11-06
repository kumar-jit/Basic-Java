package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_L7_LengthOffLL {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Node<Integer> head = new Node<>(10);
        Node<Integer> headCopy = head;
        int length = Sc.nextInt();
        for(int i = 0;i<length;i++){
            Node<Integer> temp = new Node<>(Sc.nextInt());
            head.next = temp;
            head = temp;
        }
        System.out.println(length(headCopy));
    }
    public static int length(Node head){
        //Your code goes here
        int count = 0;
        while (head!=null){
            System.out.println(head.data);
            count++;
            head = head.next;
        }
        return count;
    }

}
