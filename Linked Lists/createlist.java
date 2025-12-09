import java.util.*;
class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}
public class createlist{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n=sc.nextInt();  
        Node head=null;
        Node temp=null;
        System.out.print("\nEnter the data for each node: ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            Node newNode=new Node(x);
            if(head==null){
                head=newNode;
                temp=newNode;
            }else{
                temp.next=newNode;
                temp=newNode;
            }
        }
        sc.close();
        System.out.print("\nLinked List: \n");
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
