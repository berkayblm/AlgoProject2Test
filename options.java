package AlgoProject2Test;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class options {

    static DoublyLinkedList studentList = new DoublyLinkedList();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        try(BufferedReader in = new BufferedReader(new FileReader("ogrenciler.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                String[] line =  str.split(",");
                ArrayList<String> phoneNumbers = new ArrayList<>();
                Student student = new Student();

                for (int index = 0; index < line.length; index++) {

                    if (index == 0) { // student number
                        student.setNumber(Integer.parseInt(line[index]));
                    }
                    else if (index == 1) { // student name
                        student.setName(line[index]);
                    }

                    else if (index >= 2) { // phone numbers
                        phoneNumbers.add(line[index]);
                    }

                }

                student.setPhoneNumber(phoneNumbers);
                studentList.addStudentByOrder(student); // add student to the linked list
            }

        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }

        printOutList(studentList);

        System.out.println(showOptions());
        System.out.print("Choose the number of option you want to carry out: ");
        String choice = scanner.nextLine();

        while (!choice.equals("6")) {


            if(choice.equals("1")){ // add student by giving the whole data
                Student student = new Student();

                System.out.println("Enter the data's of the student you want to add into the list:  ");
                System.out.print("Student Number: ");
                int number = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Phone Number(s) (seperate by comma. Example : (0 525 234342, 0 532 122112) : ");
                ArrayList<String> phoneNumberArrayList = new ArrayList<>();
                String phoneNo = scanner.nextLine();
                String[] array = phoneNo.split(",");
                for (int i = 0; i < array.length; i++) {
                    phoneNumberArrayList.add(array[i]);
                }

                student.setName(name);
                student.setNumber(number);
                student.setPhoneNumber(phoneNumberArrayList);

                studentList.addStudentByOrder(student);
                printOutList(studentList);
            }


            else if(choice.equals("2")) { // print out the whole data of the student(s) by giving the name.
                System.out.print("Enter the name of the student whom you want to get data:");
                String name = scanner.nextLine();
                studentList.searchByName(name, studentList.head);



            }
            else if(choice.equals("3")) { // delete the student by given number.
                System.out.print("Enter the number of the student you want to delete from the list: ");

                int number = scanner.nextInt();
                boolean deleted = studentList.removeStudent(number, studentList);
                if (deleted == true) {
                    System.out.println("The student with number " + number + " has been successfully deleted.");
                }
                else {
                    System.out.println("No such student with number " + number + " exists");
                }
                printOutList(studentList);
                scanner.nextLine();

            }
            else if(choice.equals("4")){ // print out ascending order
                printOutList(studentList);

            }
            else if(choice.equals("5")){ // print out descending order
                traverseList(studentList);
            }

            else if (choice.equals("6")) { // quit
                break;
            }


            System.out.println(showOptions());
            System.out.print(" Choose the number of option you want to carry out:");

            choice = scanner.nextLine();

        }

    }
    public static String showOptions() {
        return ("1.Add new student\n" +
                "2.Show a student's information\n" +
                "3.Delete a student from the list\n" +
                "4.Show list by ascending order\n" +
                "5.Show list by descending order\n" +
                "6.Press '6' to quit\n");

    }
    public static void printOutList(DoublyLinkedList list) {
        System.out.println("                       ------------STUDENT LIST ASCENDING ORDER                   ------------");
        System.out.println("NO        STUDENT NUMBER                    NAME                                 PHONE NUMBER");
        DoublyLinkedList.Node current;
        current = list.head;

        int size = list.size() - (list.size() - 1);

        while (current != null) {

            System.out.println(String.valueOf(size) + ".)  " + current.data + "  ");
            size++;
            current = current.next;
        }
        System.out.println("-------------------------------------");

    }

    public static void traverseList(DoublyLinkedList list) {
        System.out.println("                       ------------STUDENT LIST ASCENDING ORDER                   ------------");
        System.out.println("NO        STUDENT NUMBER                    NAME                                 PHONE NUMBER");
        DoublyLinkedList.Node curr;
        curr = list.tail;

        int size = list.size();

        while (curr != null) {
            System.out.println(String.valueOf(size) + ".)  " + curr.data + " ");
            size--;
            curr = curr.previous;
        }
        System.out.println("-----------------------------------------------------");

    }


}