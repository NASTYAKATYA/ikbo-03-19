package lab7;

import java.util.ArrayList;
import java.util.Comparator;


    public class MyColllection {

        public static Comparator<Integer> getComp()
        {
            return Integer::compareTo;
        }

        public static void main(String[] args) {
            ArrayList list = new ArrayList();
            for (int i = 0; i < 10; i++)
                list.add((int)(Math.random()*100));


            System.out.println("size = " + list.size());
            for (Object element : list)
                System.out.print(element + " ");
            System.out.println();

            System.out.println("list[0] = " + list.get(0));
            System.out.println("удаляем элемент list[0] ");
            list.remove(0);
            System.out.println("list[0] = " + list.get(0));
            System.out.println("size = " + list.size());
            list.sort(getComp());
            for (Object element : list)
                System.out.print(element + " ");
            System.out.println();

            for (Object element : list.subList(3, 6)) {
                System.out.print(element + " ");
            }
        }
    }

