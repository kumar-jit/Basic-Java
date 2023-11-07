package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_L7_EliminateDuplicates {
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
        printLinkList(removeDuplicates(headCopy));
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        //Your code goes here
        Node<Integer> heAdCopy = head;
        while(head!=null){
            Integer currentData = head.data;
            Node<Integer> temp = head.next;
            while (temp!=null){
                if(temp.data.equals(currentData)){
                    // if LL has duplicate value at end
                    if(temp.next== null){
                        head.next = null;
                        break;
                    }
                    // to handel duplicate value middle of LL
                    temp = temp.next;
                }
                else {
                    head.next = temp;
                    break;
                }
            }
            head = head.next;
        }
        return heAdCopy;
    }
}
