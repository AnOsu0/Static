package example1.model;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastName;
    private String indexNumber;
    private static int numberOfStudents=0;

    public Student(String firstname, String lastName, String indexNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        numberOfStudents++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        Student.numberOfStudents = numberOfStudents;
    }
//    static Scanner sc = new Scanner(System.in);
//
//    public static void addStudent (){
//        System.out.println("Podaj imię: ");
//        String firstName = sc.nextLine();
//        System.out.println("Podaj nazwisko:");
//        String lastName = sc.nextLine();
//        System.out.println("Podaj nr indeksu:");
//        String indexNumber = sc.nextLine();
//        Student student = new Student (firstName, lastName, indexNumber);
//        numberOfStudents++;
//    }
}
