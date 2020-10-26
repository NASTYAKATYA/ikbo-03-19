package pract11.pract11_2;

public interface Queue {
    void superEnqueue(Object element);
    Object superDequeue();
    Object superElement();
    int size();
    boolean isEmpty();
    void superClear();
    Object[] superToArray();
}
