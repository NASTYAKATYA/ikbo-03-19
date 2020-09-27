package pract6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return t1.getMark() - student.getMark();
    }
    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student mid = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (compare(array[i],mid)<0) {
                i++;
            }
            while (compare(array[j],mid)>0) {
                j--;
            }
            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
