package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_l7_DeleteNodeInLL {
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
        printLinkList(deleteNode(headCopy, sc.nextInt()));
    }

    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
        // Write your code here.
        if(pos == 0){
            return head.next;
        }
        else{
            Node<Integer> temp = head;
            int count = 0;
            while (temp!=null){
                if(count==pos-1){
                    if(temp.next!=null && temp.next.next!=null)
                        temp.next = temp.next.next;
                    else
                        temp.next = null;
                    return head;
                }
                count++;
                temp = temp.next;
            }
        }
        return head;
    }
}
