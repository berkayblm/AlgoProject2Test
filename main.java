package AlgoProject2Test;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("05324234");
        arr1.add("03233233");

        ArrayList<String > arr2 = new ArrayList<>();
        arr2.add("324324342");
        Student student2 = new Student(2,"wqeew",arr2);
        System.out.println(student2);
        Student student1 = new Student(1,"Berkay",arr1);
        System.out.println(student1);

        System.out.println(student1.getName());
        System.out.println(student1.getNumber());
        System.out.println(student1.getPhoneNumber());*/

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2= new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();
        ArrayList<String > arr4 = new ArrayList<>();
        ArrayList<String> arr5 = new ArrayList<>();
        ArrayList<String> arr6 = new ArrayList<>();
        ArrayList<String> arr7 = new ArrayList<>();
        ArrayList<String> arr8 = new ArrayList<>();
        ArrayList<String> arr9 = new ArrayList<>();

        arr1.add("012021");
        arr2.add("34234342");
        arr3.add("352");
        arr4.add("342342t243432");
        arr5.add("23424");
        arr6.add("213213");
        arr7.add("3545343");
        arr8.add("029283");
        arr9.add("23323234");

        Student student1 = new Student(5, "Ali", arr1);
        Student student2 = new Student(7, "Vecdi Aytaç", arr2); // curr    3 5 7
        Student student3 = new Student(3, "Free", arr3);
        Student student4 = new Student(11, "Vecdi Aytaç", arr4); // tail // curr
        Student student5 = new Student(1, "Fatih Terim", arr5); // curr
        Student student6 = new Student(2, "Fatih Terim", arr5);
        Student student7 = new Student(19, "Fatih Terim", arr5);
        Student student8 = new Student(6, "Ronaldo", arr5);
        Student student9 = new Student(15,"Ysemin",arr9);


        DoublyLinkedList list = new DoublyLinkedList();
        list.addStudentByOrder(student1);
        list.addStudentByOrder(student2);
        list.addStudentByOrder(student3);
        list.addStudentByOrder(student5);
        list.addStudentByOrder(student4);
        list.addStudentByOrder(student6);
        list.addStudentByOrder(student7);
        list.addStudentByOrder(student8);
        list.addStudentByOrder(student9);
        printOutList(list);

        System.out.println("****************");

        /*System.out.println(list.head.data);
        System.out.println(list.tail.data);*/
        traverseList(list);

        System.out.println(list.getCount());
        System.out.println("***********");
        //list.sortDescending(list.head, list);
        list.searchByName("Vecdi Aytaç",list.head);
        list.searchByName("Fatih Terim",list.head);
        System.out.println("******************");
        System.out.println(list.removeStudent(1, list));
        System.out.println(list.removeStudent(19, list));
        System.out.println(list.removeStudent(7, list));
        System.out.println(list.removeStudent(15, list));
        System.out.println(list.removeStudent(2,list));
        System.out.println(list.removeStudent(6,list));
        printOutList(list);
        traverseList(list);
        //System.out.println(list.removeStudent(1, list.head));

        printOutList(list);

    }

    public static void printOutList(DoublyLinkedList list) {

        DoublyLinkedList.Node current;
        current = list.head;
        while (current != null) {

            System.out.println(current.data + "  ");
            current = current.next;
        }

    }

    public static void traverseList(DoublyLinkedList list) {

        DoublyLinkedList.Node curr;
        curr = list.tail;


        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.previous;
        }

    }




}
