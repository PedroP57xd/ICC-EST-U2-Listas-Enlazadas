package model;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void appendToTail(Contact value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public Contact findByValue(String name) {
        Node current = head;
        while (current != null) {
            if (current.getValue().getName().equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteByValue(String name) {
        if (head == null) return false;

        if (head.getValue().getName().equalsIgnoreCase(name)) {
            head = head.getNext();
            size--;
            return true;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().getName().equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int getSize() {
        return size;
    }
}
