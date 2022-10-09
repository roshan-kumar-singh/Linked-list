import java.util.*;
import java.io.*;
import java.lang.*;

class Node1 {
    int data;
    Node1 next;
    Node1(int x) {
         data = x;
         next = null ;
    }
}
public class insert_node {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        printlist(head);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for insertion and and enter the position ");
        int d=s.nextInt();
        int pos = s.nextInt();
         insertpos(head ,pos , d);
        printlist(head);

    }
    public static Node1 insertpos(Node1 head, int pos, int d) {
        Node1 temp = new Node1(d);
        if (pos == 1) {
            temp.next =head;
            return temp;
        }
        Node1 curr =head;
        for(int i=1;i<=pos-2 && curr!=null;i++)
            curr = curr.next;

        if(curr==null)
            return head;

        temp.next=curr.next;
        curr.next=temp;
        return head;

    }

    static void printlist(Node1 head) {
        Node1 curr=head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr =curr.next ;
        }
        System.out.println();
    }
}
