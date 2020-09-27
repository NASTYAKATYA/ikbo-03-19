package pract6;


public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 17,2);
        Student st2 = new Student("Petya", 18,3);
        Student st3 = new Student("Misha", 19,4);
        Student st4 = new Student("Vasya", 20,5);

        Student[] students ={st4,st3,st1,st2};
        insertionSort(students);
        for (Student s : students)
            System.out.print(s.getName() + " ");
        System.out.println();

        SortingStudentsByGPA ssbg = new SortingStudentsByGPA();
        ssbg.quickSort(students,0,students.length-1);
        for (Student s : students)
            System.out.print(s.getName() + " ");
        System.out.println();

        Merge mer = new Merge();
        students = mer.sortMerge(students);
        for (Student s : students)
            System.out.print(s.getName() + " ");
    }
    public static void insertionSort(Student[]students) {

        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber()> key.getIdNumber()) {
                students[j + 1]= students[j];
                j = j - 1;
            }
            students[j + 1]= key;
        }
    }
}
