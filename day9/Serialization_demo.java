package day9;

import java.io.*;

class Student1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private int rollno;
    private String name;

    public Student1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Student1() {
        // Default constructor
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Serialization_demo {
    public static void main(String[] args) {
        Student1 std1 = new Student1();
        std1.setRollno(10);
        std1.setName("Afrid");

        try {
            FileOutputStream out = new FileOutputStream("C://Users/raghu/OneDrive/Desktop/ALLTextDocs/javaprep.txt");
            ObjectOutputStream output = new ObjectOutputStream(out);
            output.writeObject(std1);

            output.close();
            out.close();

            System.out.println("Serialized data saved in file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}