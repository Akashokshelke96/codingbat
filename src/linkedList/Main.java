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
        insertAtFront(head,5);
        printLinkedlist(head);
    }

    public static void printLinkedlist(Node head) {

        Node curr = head;

        while(curr.getNext() != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();





        }
    }
    public static void insertAtFront(Node head, int data){
        Node nn = new Node(data);
        nn.setNext(null);

        if (head == null) {
            head = nn;
        }
        else {
            nn.setNext((head));
            head=nn;
        }
        return;
    }
}
