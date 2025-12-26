import java.util.LinkedList;

class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add - first,last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void print() {
        if (head == null) {
            System.out.print("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    // Delete
    public void deleteFirst() {
        if (head == null) {
            System.out.print("This list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.print("This list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node SecondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
    }

    // Size
    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");
        list.addLast("is");
        list.print();

        list.addLast("list");
        list.print();

        list.addFirst("this");
        list.print();

        list.deleteFirst();
        list.print();

        list.deleteLast();
        list.print();

        System.out.println(list.getSize());

        list.addFirst("this");
        System.out.println(list.getSize());

        list.addLast("list");
        System.out.println(list.getSize());

        list.print();
    }

}