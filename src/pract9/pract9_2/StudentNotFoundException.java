package pract9.pract9_2;

public class StudentNotFoundException extends Exception {
    StudentNotFoundException(String student)
    {
        super(student + " not found");
    }
}
