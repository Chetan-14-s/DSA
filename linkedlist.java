// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the linked list
public class LinkedList {
    Node head;

    // Method to insert a new node at a specific position
    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);

        // If inserting at the head (position 1)
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node before the insertion position
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        // If position is valid, insert the new node
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Invalid position!");
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating nodes and linking them
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        System.out.println("Original List:");
        list.printList();

        // Inserting 99 at position 2
        list.insertAtPosition(2, 99);

        System.out.println("After inserting 99 at position 2:");
        list.printList();

        // Inserting 50 at position 1
        list.insertAtPosition(1, 50);

        System.out.println("After inserting 50 at position 1:");
        list.printList();
    }
}
