package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node fourty = new Node(40);
        Node fifty = new Node(50);
        Node head = ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext((fourty));
        fourty.setNext((fifty));
        fifty.setNext((null));

        insertAtFront(head, 5); // method to insert items at front of the linked list;

        printLinkedlist(head);//method to print the linked list

//        head = deleteAtFront(head);
//        printLinkedlist(head);
//
//        head = deleteAtFront(head);
//        printLinkedlist(head);
//    }
    }
    public static void printLinkedlist(Node head) {
        System.out.println("Printing the Linked List!!");
        Node curr = head;
        while (curr != null && curr.getNext() != null) {                                                //here using the .getnext we stopped the iteration just before the last element
            System.out.println(curr.getData());              //adding another next .getNext we can similarly access 3rd last point
            curr = curr.getNext();


        }
    }

    public static void insertAtFront(Node head, int data) {
        Node nn = new Node(data);
        nn.setNext(null);

        if (head == null) {
            head = nn;
        } else {
            nn.setNext((head));
            head = nn;
        }
        return;
    }

    public static Node deleteAtFront(Node head) {
        if (head != null) {
            head = head.getNext();
        }
        return head;
    }
}
