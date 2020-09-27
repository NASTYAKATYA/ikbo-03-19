package pract6;

public class Student implements Comparable<Student>{
    private static int count = 0;
    private int idNumber;
    private String name;
    private int age;
    private int mark;
    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        idNumber = count;
        count++;
    }

    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public int getMark() {
        return mark;
    }


    @Override
    public int compareTo(Student student) {
        return this.idNumber - student.idNumber;
    }
}
