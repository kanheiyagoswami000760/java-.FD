class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linked {
    Node head;

    
    void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    void addBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void deleteByVal(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

    
        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted: " + data);
            return;
        }

        Node current = head;
        Node prev = null;

        
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }


        if (current == null) {
            System.out.println("Not found in the list: " + data);
            return;
        }

        prev.next = current.next;
        System.out.println("Deleted: " + data);
    }

    
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Linked list = new Linked();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);

        System.out.println("Initial list:");
        list.display();

        list.addBeginning(5);
        System.out.println("After adding at beginning:");
        list.display();

        list.deleteByVal(20);
        System.out.println("After deletion:");
        list.display();
    }
}