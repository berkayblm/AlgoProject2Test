package AlgoProject2Test;

public class DoublyLinkedList {

    class Node {
        Student data;
        Node next;
        Node previous;

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

    Node head = null;
    Node tail = null;
    private  int count = 0;

    public  int getCount() {
        return count;
    }

    public void addStudentByOrder(Student student) {

        Node newNode = new Node(student);
        Node curr;

        if (head == null) { // if the list is empty, we set head and tail to our new created Node
            head = newNode;
            tail = newNode;

            head.previous = null; // the pointer's of head and tail will refer to null
            tail.next = null;

        }

        /*
        If the number of our new Student is less than the head Node's data's  st. number.
         */

        else if (head.data.getNumber() >= newNode.data.getNumber()) {

            newNode.next = head;
            newNode.next.previous = newNode;
            head = newNode;

        }



        else {

            curr = head;

            while (curr.next != null && curr.next.data.getNumber() < newNode.data.getNumber()) {
                curr = curr.next;

            }

            /*Node findTail = head;
            while (findTail.next != null) {
                findTail = findTail.next;
            }
            tail = findTail;*/

            newNode.next = curr.next;

            if (curr.next != null) {

                newNode.next.previous = newNode;


            }
            curr.next = newNode;
            newNode.previous = curr;
            //newNode.previous = head;
            if (newNode.data.getNumber() >= tail.data.getNumber())
                tail = newNode;

        }
        count++;


    }


    public String searchByName(String name) {


        while (head.data.getName() != name && head.next != null) {
            head = head.next;

        }

        if (head.data.getName() == name) {
            return head.data.toString();
        }

        else {

            return null;
        }

    }

    public int size() {
        return count;
    }



}
