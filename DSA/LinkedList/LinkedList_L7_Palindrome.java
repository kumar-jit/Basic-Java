package DSA.LinkedList;

import java.util.Scanner;

public class LinkedList_L7_Palindrome {
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
        System.out.println(isPalindrome(headCopy));
    }

    // using extra space
    //-------------------------------------------

    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        String normal = makeString(head);
        String reverse = makeReverseString(head);
        return normal.equals(reverse);
    }

    public static String makeString(Node<Integer> head){
        if(head==null)
            return "";
        return (head.data + makeString(head.next));
    }
    public static String makeReverseString(Node<Integer> head){
        if(head==null)
            return "";
        return makeReverseString(head.next) + head.data;
    }



//    public static boolean isPalindrome(Node<Integer> head) {
//        int length = length(head);
//        int halfLength  = length/2;
//        int head
//    }
//    public static int length(Node<Integer> head){
//        int count = 0;
//        while (head!=null){
//            count++;
//            head = head.next;
//        }
//        return count;
//    }
}
