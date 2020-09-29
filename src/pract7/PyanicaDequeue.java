package pract7;

import java.util.Deque;
import java.util.LinkedList;

public class PyanicaDequeue extends Pyanica<Deque<Integer>> {
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
        int count = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count < 106)
        {
            if (firstPlayer.peek() > secondPlayer.peek() && (firstPlayer.peek() != 9 || secondPlayer.peek() != 0))
                moveCards(1);
            else
                moveCards(2);
            count++;
        }
        if (secondPlayer.isEmpty())
            System.out.println("first " + count);
        else if (firstPlayer.isEmpty())
            System.out.println("second " + count);
        else
            System.out.println("botva");
    }
    @Override
    protected void moveCards(int win) {
        if(win==1){
            firstPlayer.add(firstPlayer.poll());
            firstPlayer.add(secondPlayer.poll());
        }
        else{
            secondPlayer.add(firstPlayer.poll());
            secondPlayer.add(secondPlayer.poll());
        }
    }
}
