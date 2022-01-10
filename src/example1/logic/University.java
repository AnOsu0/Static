package example1.logic;

import example1.model.Student;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Anna","Manna","123456");
        Student student2 = new Student("Anna","Panna","123456");
        Student student3 = new Student("Anna","Wanna","123456");
        System.out.println("liczba studentów na uczelni to: " + Student.getNumberOfStudents());
    }
}
