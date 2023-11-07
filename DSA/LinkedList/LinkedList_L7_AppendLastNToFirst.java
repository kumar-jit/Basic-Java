package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_L7_AppendLastNToFirst {
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
        printLinkList(appendLastNToFirst(headCopy,sc.nextInt()));
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        //Your code goes here
        if(n==0){
            return head;
        }else {

            // calculating length
            int length = length(head);
            Node<Integer> temp = head;
            Node<Integer> newHead = null;
            int count = 0;
            while (temp!=null){
                // finding the breaking point
                if(count == length - n - 1){
                    // changing head
                    newHead = temp.next;
                    //making tail null
                    temp.next = null;
                    break;
                }
                count++;
                temp = temp.next;
            }
            temp = newHead;
            // adding head to end
            while (temp!=null){
                if(temp.next == null){
                    temp.next = head;
                    break;
                }
                temp = temp.next;
            }
            return newHead;
        }
    }

    // calculating linkedList length
    public static int length(Node head){
        //Your code goes here
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
