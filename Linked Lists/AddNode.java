import java.util.*;
class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}
public class AddNode {
    static Node connect(Node head, int pos){
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        int index=0;
        Node target=head;
        while(index<pos){
            target=target.next;
            index++;
        }
        tail.next=target;
        return tail;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n=sc.nextInt();
        Node head=null;
        Node temp=null;
        System.out.print("Enter data for all nodes: ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            Node newNode=new Node(x);
            if(head==null){
                head=newNode;
                temp=newNode;
            }else{
                temp.next=newNode;
                temp=temp.next;
            }
        }
        System.out.print("Enter postion to which the last node should connect to (head=pos 0): ");
        int pos=sc.nextInt();
        Node tail=connect(head, pos);
        System.out.print("Nodes connected. The tail ("+tail.data+") connects to the node with data: "+tail.next.data);
        sc.close();
    }
}
