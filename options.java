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

                    if (line.length > 3) { // if the person has more than 1 phone number.

                        if (index == 0) { // student number
                            student.setNumber(Integer.parseInt(line[index]));
                        }
                        else if (index == 1) { // student name
                            student.setName(line[index]);
                        }

                        else { // phone numbers
                            phoneNumbers.add(line[index]);
                        }

                    }


                    else { // if the person has only one phone number.

                        if (index == 0) {
                            student.setNumber(Integer.parseInt(line[index]));
                        }
                        else if (index == 1) {
                            student.setName(line[index]);
                        }

                        else {
                            phoneNumbers.add(line[index]);
                        }

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
        studentList.searchByName("Canan Demir", studentList.head);
        showOptions();
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
                System.out.println("Enter the name of the student whom you want to get data.");
                String name = scanner.nextLine();
                studentList.searchByName(name, studentList.head);



            }
            else if(choice.equals("3")) {

            }
            else if(choice.equals("4")){

            }
            else if(choice.equals("5")){

            }

            else if (choice.equals("6")) {
                break;
            }


            showOptions();
            System.out.println("Yapmak istediginiz işlemi seçiniz: ");
            choice = scanner.nextLine();

        }




    }
    public static String showOptions() {
        return ("1.Listeyi oluşturma\n" +
                "2.Listeye ekleme yapma\n" +
                "3.Öğrenci bilgisini ekrana yazdırma\n" +
                "4.Listeden öğrenci silme\n" +
                "5.Listeyi ekrana yazdırma\n" +
                "6.Listeyi azalan sırada ekrana yazdırma\n" +
                "7.Çıkış için '7' ya basınız");


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