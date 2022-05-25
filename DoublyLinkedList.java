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

    Node head = null;   // setting head and tail to null
    Node tail = null;
    private int count = 0;  // count variable count how many Student object there are in the linked list.

    public  int getCount() {
        return count;
    }

    public void addStudentByOrder(Student student) {   // adding student by order

        Node newNode = new Node(student);   // create a new Node and set student inside the node.
        Node curr; // current Node for iterating through the linked list

        if (head == null) { // if the list is empty, we set head and tail to our new created Node
            head = newNode;
            tail = newNode;

            head.previous = null; // the pointer's of head and tail will refer to null
            tail.next = null;

        }

        /*
        If the number of our new Student is less or equal than the head Node's data's  st. number.
         */

        else if (head.data.getNumber() >= newNode.data.getNumber()) {

            newNode.next = head;
            newNode.next.previous = newNode;
            head = newNode;

        }

        else {      // if student's number is greater than the current Node's student number.

            curr = head;   // set curr to head

            while (curr.next != null && curr.next.data.getNumber() < newNode.data.getNumber()) {
                curr = curr.next;   // jump to the other node

            }

            newNode.next = curr.next;

            if (curr.next != null) {

                newNode.next.previous = newNode;

            }
            curr.next = newNode;
            newNode.previous = curr;
            if (newNode.data.getNumber() >= tail.data.getNumber())   // if it is greater than the tail's number
                tail = newNode;

        }
        count++;   // increase the number of student in the linked list every time we add new student.

    }

    public void searchByName(String name, Node head) {    // search student data by name

        Node curr = head;    // set curr node to head
        boolean exist = false;

        while (curr.next != null) {

            if (curr.data.getName().equals(name)) {     // if the name's are equal
                System.out.println("Number: "+ curr.data.getNumber() + "\n"+
                        "Name: " + curr.data.getName() + "\n" + "Phone Number: " + curr.data.getPhoneNumber());
                // print out the data
                exist = true;
            }
            curr = curr.next;

            if (curr.next == null && curr.data.getName().equals(name)) {
                System.out.println("Number: "+ curr.data.getNumber() + "\n"+
                        "Name: " + curr.data.getName() + "\n" + "Phone Number: " + curr.data.getPhoneNumber());
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

    public boolean removeStudent(int number, DoublyLinkedList list) {   // remover the student by giving number

        Node position = list.head; // set position to head
        while (position != null) {

            if (position.data.getNumber() == number)

                if(position != head && position != tail) {  // if it is neither tail nor head.

                    position.previous.next = position.next;
                    position.next.previous = position.previous;
                    position = position.next;

                    count--;   // decrease the amount of student from the list
                    return true;
                }

                else if (position.previous == null) {  // if it is head
                    list.head = list.head.next;

                    if (list.head != null) {
                        list.head.previous = null;
                    }
                    count--;
                    return true;

            }
                else if (position == tail) {   // if it is tail
                    position.previous.next = null;
                    tail = position.previous;
                    count--;
                    return true;
                }

            position = position.next;  // jump to the other node
        }

        return false;  // returns false if cannot not be removed.

    }

}
