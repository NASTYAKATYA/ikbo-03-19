package pract10.pract10_2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Клиент сел на " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}