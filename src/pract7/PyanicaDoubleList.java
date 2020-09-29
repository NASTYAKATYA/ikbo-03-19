package pract7;
import java.util.LinkedList;

public class PyanicaDoubleList extends Pyanica<LinkedList<Integer>>{

    @Override
    protected void firstPush(int[] cards) {
        for(int i = 0;i<cards.length;i++)
            firstPlayer.add(cards[i]);
    }

    @Override
    protected void secondPush(int[] cards) {
        for(int i = 0;i<cards.length;i++)
            secondPlayer.add(cards[i]);
    }

    @Override
    public void start(int[] firstCards, int[] secondCards) {
        firstPlayer = new LinkedList<>();
        secondPlayer = new LinkedList<>();
        firstPush(firstCards);
        secondPush(secondCards);
        int counter = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && counter < 106)
        {
            if (firstPlayer.peek() > secondPlayer.peek() && (firstPlayer.peek() != 9 || secondPlayer.peek() != 0))
                moveCards(1);
            else
                moveCards(2);
            counter++;
        }
        if ( secondPlayer.isEmpty())
            System.out.println("first " + counter);
        else if (firstPlayer.isEmpty())
            System.out.println("second " + counter);
        else
            System.out.println("botva");
    }
    @Override
    protected void moveCards(int win) {

        if (win == 1)
        {
            firstPlayer.add(firstPlayer.poll());
            firstPlayer.add(secondPlayer.poll());
        }
        else
        {
            secondPlayer.add(firstPlayer.poll());
            secondPlayer.add(secondPlayer.poll());
        }
    }
}
