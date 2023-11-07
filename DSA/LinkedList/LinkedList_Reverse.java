package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_Reverse {
    public static void printLinkList(Node <Integer> head){
        while (head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = new Node<>(1) ;
        Node<Integer> headCopy = null;
        while(true){
            int data = sc.nextInt();
            if(data!=-1){
                if(headCopy==null){
                    headCopy = head;
                    head.data = data;
                }else {
                    Node<Integer> temp = new Node<>(data);
                    head.next = temp;
                    head = temp;
                }
            }
            else {
                break;
            }
        }
        printLinkList(headCopy);
        printLinkList(reverse(headCopy));
    }

    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> previous = null;
        Node<Integer> next = head;
        while (head!=null){
            // storing the next Node
            next = head.next;

            // adding the previous node
            head.next = previous;

            // making current node as previous node
            previous = head;

            // checking tail node
            if(next!=null)
                // if not tail node then making next node as head
                head = next;
            else {
                break;
            }
        }
        return head;
    }

}
