package pract11.pract11_1;

public class TestArrayQueue {
    public static void main(String[] args) {

        System.out.println("ArrayQueueModule: ");
        System.out.println("is empty "+ArrayQueueModule.isEmpty());
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        ArrayQueueModule.enqueue(4);
        ArrayQueueModule.enqueue(5);
        System.out.println("is empty "+ArrayQueueModule.isEmpty());
        System.out.println("size = "+ArrayQueueModule.size());
        System.out.println("delete: "+ArrayQueueModule.dequeue());
        System.out.println("size = "+ArrayQueueModule.size());
        System.out.println("first element: " +ArrayQueueModule.element());

        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        System.out.println("ArrayQueueADT: ");
        System.out.println("is empty "+arrayQueueADT.isEmpty(arrayQueueADT));
        arrayQueueADT.enqueue(arrayQueueADT,1);
        arrayQueueADT.enqueue(arrayQueueADT,2);
        arrayQueueADT.enqueue(arrayQueueADT,3);
        arrayQueueADT.enqueue(arrayQueueADT,4);
        arrayQueueADT.enqueue(arrayQueueADT,5);
        System.out.println("is empty "+arrayQueueADT.isEmpty(arrayQueueADT));
        System.out.println("size = "+arrayQueueADT.size(arrayQueueADT));
        System.out.println("delete: "+arrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("size = "+arrayQueueADT.size(arrayQueueADT));
        System.out.println("first element: " + arrayQueueADT.element(arrayQueueADT));

        ArrayQueue arrayQueue = new ArrayQueue();
        System.out.println("ArrayQueue: ");
        System.out.println("is empty "+arrayQueue.isEmpty());
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        System.out.println("is empty "+arrayQueue.isEmpty());
        System.out.println("size = "+arrayQueue.size());
        System.out.println("delete: "+arrayQueue.dequeue());
        System.out.println("size = "+arrayQueue.size());
        System.out.println("first element: " +arrayQueue.element());
    }
}
