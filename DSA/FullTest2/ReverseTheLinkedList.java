package DSA.FullTest2;
import java.util.*;
import java.lang.*;
class Node{
    int data;
    Node next;
    Node (int key)
    {
        data=key;
        next=null;
    }
}

class Solution{

    public static Node reverse(Node head, int k)
    {
        int count = k;

        Node finalNode = null;
        Node preTail = head;
        Node currTail = null;
        Node next = null;
        Node previous = null;

        while (head!=null){
            count--;

            next = head.next;
            head.next = previous;
            previous = head;

            if(count <= 0){
                if(finalNode == null){
                    finalNode = head;
                    currTail = next;
                }
                else {
                    preTail.next = head;
                    preTail = currTail;
                    currTail = next;
                }

                count = k;

            }

            head = next;
        }

        if(count > 0 && count < 4){
            if(finalNode == null){
                finalNode = previous;
            }
            else {
//                previous.next = null;
                preTail.next = previous;
                currTail.next = null;
            }
        }

        return  finalNode;
    }

}

/**
 * #######################################################
 */
public class ReverseTheLinkedList {
    static Node head;
    public static void main (String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        Node head=new Node(a);
        Node prev=head;
        for(int i=0;i<n-1;i++)
        {
            a=s.nextInt();
            Node newnode=new Node(a);
            prev.next=newnode;
            prev=newnode;
        }
        int k=s.nextInt();
        Node ans=Solution.reverse(head,k);
        prev=ans;
        for(int i=0;i<n;i++)
        {
            System.out.print(prev.data+" ");
            prev=prev.next;
        }

    }
}
