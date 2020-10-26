package pract11.pract11_2;

public class ArrayQueue extends AbstractQueue implements Queue {

    private int head = 0;
    private Object[] elements = new Object[10];

    protected void enqueue(Object element) {
        setCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
    }

    protected void dequeue() {
        head = (head + 1) % elements.length;
    }

    protected Object element() {
        return elements[head];
    }

    protected void clear() {
        Object[] newQueue = new Object[10];
        elements = newQueue;
        head = 0;
    }
    private void setCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newQueue = new Object[2 * capacity];
        if (head == 0) {
            for (int i = 0; i < size; i++) {
                newQueue[i] = elements[i];
            }
            elements = newQueue;
        } else {
            for (int i = head; i < elements.length; i++) {
                newQueue[i - head] = elements[i];
            }
            for (int i = 0; i <= (head + size) % elements.length; i++) {
                newQueue[i + elements.length - head] = elements[i];
            }
            head = 0;
            elements = newQueue;
        }
    }

    protected Object[] toArray(Object[] newQueue) {
        if (head + size <= elements.length) {
            for (int i = head; i < head + size; i++) {
                newQueue[i-head] = elements[i];
            }
        } else {
            for (int i = head; i < elements.length; i++) {
                newQueue[i - head] = elements[i];
            }
            for (int i = 0; i < (head + size) % elements.length; i++) {
                newQueue[i + elements.length - head] = elements[i];
            }
        }
        return newQueue;
    }
}