package pract9.pract9_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        LabClassUI labClassUI = new LabClass().getClassUi();
        labClassUI.addStudent(new Student("Ivan", 17,5));
        labClassUI.addStudent(new Student("Petya", 18,4));
        labClassUI.addStudent(new Student("Misha", 19,3));
        labClassUI.addStudent(new Student("Vasya", 20,2));
        System.out.println(labClassUI);
        labClassUI.sortStudent();
        System.out.println(labClassUI);
        Scanner scan = new Scanner(System.in);
        System.out.println(labClassUI.getStudent(scan.next()));
    }
}
