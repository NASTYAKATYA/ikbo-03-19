package pract7;

public class TestPyanica {
    public static void main(String[] args) {
        int[] firstPlayer = {1,3,5,7,9};
        int[] secondPlayer = {2,4,5,7,9};
        PyanicaStack pyanicaStack = new PyanicaStack();
        pyanicaStack.start(firstPlayer,secondPlayer);

        PyanicaQueue pyanicaQueue = new PyanicaQueue();
        pyanicaQueue.start(firstPlayer,secondPlayer);

        PyanicaDequeue pyanicaDequeue = new PyanicaDequeue();
        pyanicaDequeue.start(firstPlayer,secondPlayer);

        PyanicaDoubleList pyanicaDoubleList = new PyanicaDoubleList();
        pyanicaDoubleList.start(firstPlayer,secondPlayer);
    }

}
