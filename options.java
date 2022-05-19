package AlgoProject2Test;

import abstract_classes.Triangle;

import java.io.*;
import java.util.Scanner;

public class options {

    static DoublyLinkedList studentList = new DoublyLinkedList();

    public static void main(String[] args) {
        showOptions();
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        while (!choice.equals("7")) {


            if (choice.equals("1")){
                try {
                    File file = new File("ogrenciler.txt");
                    scanner = new Scanner(file);

                    while (scanner.hasNextLine()) {

                        int number = scanner.nextInt();


                        Student student = new Student();

                    }


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }



                /*try(BufferedReader in = new BufferedReader(new FileReader("ogrenciler.txt"))) {
                    String str;
                    while ((str = in.readLine()) != null) {
                        String[] line =  str.split(",");
                        for (String  s : line)
                            System.out.print(s);

                    }

                }
                catch (IOException e) {
                    System.out.println("File Read Error");
                }*/


            }
            else if(choice.equals("2")){
                System.out.println("2343");
            }
            else if(choice.equals("3")){
                System.out.println("dsffsd");
            }
            else if(choice.equals("4")) {

            }
            else if(choice.equals("5")){

            }
            else if(choice.equals("6")){

            }

            else if (choice.equals("7")) {
                break;
            }


            showOptions();
            System.out.println("Yapmak istediginiz işlemi seçiniz: ");
            choice = scanner.nextLine();

        }




    }
    public static String showOptions(){
        return ("1.Listeyi oluşturma\n"+
        "2.Listeye ekleme yapma\n"+
        "3.Öğrenci bilgisini ekrana yazdırma\n"+
        "4.Listeden öğrenci silme\n"+
        "5.Listeyi ekrana yazdırma\n"+
        "6.Listeyi azalan sırada ekrana yazdırma\n"+
        "7.Çıkış için '7' ya basınız");


    }
}
