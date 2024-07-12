/* package LinkedList;

public class ReverseLL 
{
    static Node head;
    public static void main(String[] args) {
        head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);

        print(head);
        reverse(head);
        


    }

    private static void print(Node head) 
    {
        Node start=head;
        while(start!=null)
        {
            System.out.println(start.data);
            start=start.next;
        }
    }

    private static void reverse(Node head) 
    {
        Node current=head;
        Node previous=null;
        Node next=null;
        while(current!=null)
        {
           next=current.next;
           current.next=previous;
           previous=current;
           current=next;
        }
        print(previous);
    }
}
class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
} */