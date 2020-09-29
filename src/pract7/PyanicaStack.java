package pract7;
import java.util.Stack;
public class PyanicaStack extends Pyanica<Stack<Integer>> {

        @Override
        protected void firstPush(int[] cards) {
            for(int i = cards.length-1;i>=0;i--)
                firstPlayer.push(cards[i]);
        }

        @Override
        protected void secondPush(int[] cards) {
            for(int i = cards.length-1;i>=0;i--)
                secondPlayer.push(cards[i]);
        }

        @Override
        public void start(int[] firstCards, int[] secondCards) {
            firstPlayer = new Stack<>();
            secondPlayer = new Stack<>();
            firstPush(firstCards);
            secondPush(secondCards);
            int count = 0;
            while(!firstPlayer.empty() && !secondPlayer.empty() && count < 106)
            {
                if (firstPlayer.peek() > secondPlayer.peek() && (firstPlayer.peek() != 9 || secondPlayer.peek() != 0))
                    moveCards(1);
                else
                    moveCards(2);
                count++;
            }
            if (secondPlayer.empty())
                System.out.println("first " + count);
            else if (firstPlayer.empty())
                System.out.println("second " + count);
            else
                System.out.println("botva");
        }

    @Override
    protected void moveCards(int win) {
        Stack<Integer> temp = new Stack<>();
        int []cards = new int[2];
        cards[1] = firstPlayer.peek();
        cards[0] = secondPlayer.peek();
        firstPlayer.pop();
        secondPlayer.pop();
        if (win == 1)
        {
            while(!firstPlayer.empty())
            {
                temp.push(firstPlayer.peek());
                firstPlayer.pop();
            }
            firstPlayer.push(cards[0]);
            firstPlayer.push(cards[1]);
            while(!temp.empty())
            {
                firstPlayer.push(temp.peek());
                temp.pop();
            }
        }
        else
        {
            while(!secondPlayer.empty())
            {
                temp.push(secondPlayer.peek());
                secondPlayer.pop();
            }
            secondPlayer.push(cards[0]);
            secondPlayer.push(cards[1]);
            while(!temp.empty())
            {
                secondPlayer.push(temp.peek());
                temp.pop();
            }
        }
    }
    }
