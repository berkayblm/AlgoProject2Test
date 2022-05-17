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
        ArrayList<String> arr4 = new ArrayList<>();
        ArrayList<String> arr5 = new ArrayList<>();

        arr1.add("012021");
        arr2.add("34234342");
        arr3.add("352");
        arr4.add("324234");
        arr5.add("23424");
        Student student1 = new Student(5, "Ali", arr1);
        Student student2 = new Student(7, "Vecdi", arr2);
        Student student3 = new Student(3, "Free", arr3);
        Student student5 = new Student(9, "Arda", arr5);

        DoublyLinkedList list = new DoublyLinkedList();
        list.addStudentByOrder(student1);
        list.addStudentByOrder(student2);
        list.addStudentByOrder(student3);
        list.addStudentByOrder(student4);
        list.addStudentByOrder(student5);

        while (list.head != null) {
            System.out.println(list.head.data + "  ");
            list.head = list.head.next;
        }


    }
}
