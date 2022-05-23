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
    private int count = 0;

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

            newNode.next = curr.next;

            if (curr.next != null) {

                newNode.next.previous = newNode;

            }
            curr.next = newNode;
            newNode.previous = curr;
            if (newNode.data.getNumber() >= tail.data.getNumber())
                tail = newNode;

        }
        count++;

    }

    public void searchByName(String name, Node head) {

        Node curr = head;
        boolean exist = false;

        while (curr.next != null) {

            if (curr.data.getName().equals(name)) {
                System.out.println(curr.data);
                exist = true;
            }
            curr = curr.next;

            if (curr.next == null && curr.data.getName().equals(name)) {
                System.out.println(curr.data);
                exist = true;
            }
        }

        if (exist == false) {
            System.out.println("No such student found in the list.");
        }

    }

    public int size() {
        return count;
    }

    public boolean removeStudent(int number, DoublyLinkedList list) {

        Node position = list.head;
        while (position != null) {

            if (position.data.getNumber() == number)

                if(position != head && position != tail) {

                    position.previous.next = position.next;
                    position.next.previous = position.previous;
                    position = position.next;

                    count--;
                    return true;
                }

                else if (position.previous == null) {
                    list.head = list.head.next;

                    if (list.head != null) {
                        list.head.previous = null;
                    }
                    count--;
                    return true;

            }
                else if (position == tail) {
                    position.previous.next = null;
                    tail = position.previous;
                    count--;
                    return true;
                }

            position = position.next;
        }

        return false;

    }

}
