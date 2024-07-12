package Questions;

import java.io.IOException;
import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Node1 head = new Node1(sc.nextInt());
        Node1 tail = head;
        while (t-- > 1) {
            tail.next = new Node1(sc.nextInt());
            tail = tail.next;
        }
        Node1 node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print("null");
        sc.close();
    }
}
