package pract9.pract9_2;

public class Student implements Comparable<Student>{
    private static int count = 0;
    private int idNumber;
    private String name;
    private int age;
    private int mark;
    public Student(String name, int age, int mark) throws EmptyStringException {
        if (name.isEmpty())
            throw new EmptyStringException("is empty");
        this.name = name;
        this.age = age;
        this.mark = mark;
        idNumber = count;
        count++;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student student) {
        return (this.mark - student.mark);
    }

}
