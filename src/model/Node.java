package model;

public class Node {
    private Contacto value;
    private Node next;

    public Node(Contacto value) {
        this.value = value;
        this.next = null;
    }

    public Contacto getValue() {
        return value;
    }

    public void setValue(Contacto value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
