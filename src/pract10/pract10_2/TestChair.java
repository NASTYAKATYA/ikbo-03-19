package pract10.pract10_2;

public class TestChair {
    public static void main(String[] args) {
        Client client = new Client();

        client.setChair(new ChairFactory().createVictorianChair());
        client.sit();

        client.setChair(new ChairFactory().createFunctionalChair());
        client.sit();

        client.setChair(new ChairFactory().createMagicChair());
        client.sit();



    }
}
