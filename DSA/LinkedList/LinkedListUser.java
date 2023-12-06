package DSA.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedListUser {
    public static void printLinkList(Node <Integer> head){
        System.out.println("Inside Print function HEAD " + head );
        while (head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
        System.out.println(head);
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
        System.out.println("Inside MAIN function HEAD Before 1Print call" +headCopy);
        printLinkList(headCopy);
        System.out.println("Inside MAIN function HEAD After print call" + headCopy);
        printLinkList(headCopy);

//        printLinkList(headCopy);
    }


    public static void change(int[] a,Node<Integer> b){
        System.out.println("Change : befor change " + a);
        int[] arr2 = new int[10];
        a = arr2;
        System.out.println("Change : after change " + a);
    }



}
