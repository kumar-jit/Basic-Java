package DSA.LinkedList;

import java.util.Objects;
import java.util.Scanner;

public class LinkedList_L7_InsertNodeInLL {
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
        Node<Integer> NewHead = insert(headCopy,sc.nextInt(),sc.nextInt());
        printLinkList(NewHead);
    }

    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        //Your code goes here
        Node<Integer> temp = head;
        int count = 0;

        // add new node as head
        if(pos == 0){
            Node<Integer> tempNode = new Node<>(data);
            tempNode.next = head;
            return tempNode;
        }
        else {
            while (temp!=null){
                // searching for position -1
                if(count==pos-1){

                    // creating new node
                    Node<Integer> tempNode = new Node<>(data);
                    // linking new next node
                    tempNode.next = temp.next;
                    temp.next = tempNode;
                    return head;
                }
                count ++;
                temp = temp.next;
            }
            return head;
        }
    }
}

