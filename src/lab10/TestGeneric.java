package lab10;
import java.io.File;
import java.util.ArrayList;

public class TestGeneric {
    public static <E> ArrayList<E> Ex1(E[] array)
    {
        ArrayList<E> arrayList = new ArrayList<>();
        for (E element:array)
            arrayList.add(element);
        return arrayList;
    }

    public static <E> E Ex3(E[] array, int index)
    {
        return array[index];
    }

    public static void Ex4(File directory)
    {
        ArrayList<String> list = new ArrayList<>();
        if (directory.isDirectory()) {
            for (File file : directory.listFiles())
                list.add(file.getName());
            for (int i = 0;i<5;i++)
            {
                try {
                    System.out.println(list.get(i));
                }
                catch (Exception e) {}
            }
        }
        else
            System.out.println("not found");
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        String[] strArray = {"a", "b", "c", "e", "d" };
        ArrayList<Integer> intArrayList = Ex1(intArray);
        ArrayList<String> strArrayList = Ex1(strArray);
        for (Integer element: intArrayList)
            System.out.print(element+" ");
        System.out.println();
        for (String element: strArrayList)
            System.out.print(element+" ");
        System.out.println("\n");


        Ex2<Integer> array = new Ex2<>(3);
        array.add((int) 1);
        array.add((int) 2);
        array.add((int) 3);
        array.arrayPrint();
        array.clear();
        System.out.println("\n");


        System.out.println(Ex3(intArray,0) + " " + Ex3(strArray,3)+"\n");

        Ex4(new File("C:\\Users\\NEWHOME\\Desktop\\рисунки\\practice\\.idea"));
    }
}