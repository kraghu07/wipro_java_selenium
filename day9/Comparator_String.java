package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student[age=" + age + ", name=" + name + "]";
    }
}

public class Comparator_String {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return Integer.compare(i.age, j.age);
            }
        };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(22, "Karthik"));
        stud.add(new Student(24, "Sanjeev"));
        stud.add(new Student(23, "Sunil"));

        Collections.sort(stud, com);

        for (Student s : stud) {
            System.out.println(s);
        }
    }
}