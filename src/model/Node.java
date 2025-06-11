package model;

public class Node {
    private Contact value;
    private Node next;

    public Node(Contact value) {
        this.value = value;
        this.next = null;
    }

    public Contact getValue() {
        return value;
    }

    public void setValue(Contact value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
