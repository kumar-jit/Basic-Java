package DSA.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_L7_PrintReversed {
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
        printReverseUsingRecursion(headCopy);
    }

    // using extra space
    public static void printReverse(Node<Integer> root) {
        //Your code goes here
        List<Integer> arr = new ArrayList<>();
        while (root!=null){
            arr.add(root.data);
            root = root.next;
        }
        for (int i = arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i) + " ");
        }
    }

    // Using Recursion No extra space
    public static void printReverseUsingRecursion(Node<Integer> root) {
        //Your code goes here
        if(root==null){
            return;
        }
        printReverseUsingRecursion(root.next);
        System.out.print(root.data + " ");
    }


}
