package AlgoProject2Test;

public class Node {
    private Student data;
    private Node next;
    private Node previous;

    public Node() {
        data = null;
        next = null;
        previous = null;
    }

    public Node(Student data) {
        this.data = data;

    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
