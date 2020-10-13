package pract9.pract9_2;

public interface LabClassUI {
    Student getStudent(String name) throws StudentNotFoundException;
    void addStudent(Student student);
    void sortStudent();
}
