package AlgoProject2Test;

import java.util.ArrayList;

public class Student {
    private int number;
    private String name;
    private ArrayList<String> phoneNumber = new ArrayList<String>();

    public Student() {
        number = 0;
        name = null;
        phoneNumber = null;
    }

    public Student(int number, String name, ArrayList<String> phoneNumber) {
        setName(name);
        setNumber(number);
        setPhoneNumber(phoneNumber);
    }

    public Student(Student newStudent) {
        this.name = newStudent.name;
        this.number = newStudent.number;
        this.phoneNumber = newStudent.phoneNumber;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String > getPhoneNumber() {

        return phoneNumber;

    }

    public void setPhoneNumber(ArrayList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "              " + getNumber() +
                "                 " + getName() +
                "                 " + getPhoneNumber();
    }
}
