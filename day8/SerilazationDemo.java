package day8;

import java.io.*;

// Student6 must implement Serializable to allow object serialization
class Student6 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Student6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student6() {
        // Default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SerilazationDemo {
    public static void main(String[] args) {
        try {
            // Create Student6 object and set data
            Student6 s1 = new Student6();
            s1.setName("Suresh");
            s1.setAge(25);

            // Serialization: Writing object to file
            FileOutputStream out = new FileOutputStream("C://Users/raghu/OneDrive/Desktop/ALLTextDocs/outputdemo.txt");
            ObjectOutputStream output = new ObjectOutputStream(out);
            output.writeObject(s1);
            output.close();
            out.close();
            System.out.println("Object serialized successfully.");

            // Deserialization: Reading object from file
            FileInputStream in = new FileInputStream("C://Users/raghu/OneDrive/Desktop/ALLTextDocs/outputdemo.txt");
            ObjectInputStream input = new ObjectInputStream(in);
            Student6 s2 = (Student6) input.readObject();
            input.close();
            in.close();

            // Print deserialized data
            System.out.println("Deserialized Student:");
            System.out.println("Name: " + s2.getName());
            System.out.println("Age: " + s2.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}