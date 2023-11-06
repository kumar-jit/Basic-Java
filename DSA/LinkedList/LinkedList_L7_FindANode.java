package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_L7_FindANode {
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
        System.out.println(findNode(headCopy, sc.nextInt()));
    }
    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        int count = 0;
        while (head!=null){
            if(head.data == n)
                return count;
            count++;
            head = head.next;
        }
        return -1;
    }
}
