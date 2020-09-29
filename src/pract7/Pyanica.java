package pract7;

public abstract class Pyanica<T> {
        protected T firstPlayer;
        protected T secondPlayer;

        protected abstract void firstPush(int[] cards);
        protected abstract void secondPush(int[] cards);
        public abstract void start(int[] firstCards, int[] secondCards);
        protected abstract void moveCards(int win);
}
