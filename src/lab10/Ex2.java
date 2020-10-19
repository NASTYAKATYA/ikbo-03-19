package lab10;

import java.util.Arrays;

public class Ex2<E> {
    private E[] array;
    private int i;
    Ex2(int size)
    {
        array = (E[]) new Object[size];
        i = 0;
    }
    void add(E element)
    {
        array[i++] = element;
    }
    E getElem(int index)
    {
        return array[index];
    }
    void clear()
    {
        Arrays.fill(array,null);
    }
    void arrayPrint()
    {
        for (E element:array)
            System.out.print(element+" ");
    }
}