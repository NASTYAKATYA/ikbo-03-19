package pract9.pract9_2;

import java.util.ArrayList;
import java.util.Comparator;

public class LabClassDriver implements LabClassUI {
    private ArrayList<Student> students = new ArrayList<>();
    @Override
    public Student getStudent(String name) throws StudentNotFoundException {
        for (Student s: students) {
            if (s.getName().equals(name))
                return s;
        }
        throw new StudentNotFoundException(name);
    }

    @Override
    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public void sortStudent() {
        students.sort(Comparator.comparing(Student::getMark));
    }

    @Override
    public String toString() {
        String list = "";
        for (Student s: students) {
            list += s.getName()  + " ";
        }
        return list ;
    }
}
