package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListExample l = new LinkedListExample();
        Node first = l.new Node(10);
        l.head = first;

        Node second = l.new Node(20);
        first.next = second;

        Node third = l.new Node(30);
        second.next = third;

        l.printList();
    }
}
