package pract8;
import java.util.ArrayList;
import java.util.List;
/**@author Me*/
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        System.out.print("list: ");
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        for(int i=0;i<10;i++){
            if(i<9)
                System.out.print(list.get(i) +", ");
            else System.out.print(list.get(i));
        }
        System.out.println("\n");
        WaitList<Integer> bWL = new BoundedWaitList<>(10);
        for (int i = 0; i < 10; i++)
            bWL.add(i+1);
        System.out.println(bWL);
        System.out.println("contains 0: " + bWL.contains(0));
        System.out.println("contains list: " + bWL.containsAll(list));
        System.out.println("remove first: " + bWL.remove());
        System.out.println(bWL);
        System.out.println("contains list: " + bWL.containsAll(list));
        System.out.println("is empty: " + bWL.isEmpty());
        System.out.println();

        UnfairWaitList<Integer> uWL = new UnfairWaitList<>();
        for (int i = 0; i < 10; i++)
            uWL.add(i+1);
        System.out.println(uWL);
        System.out.println("contains 10: " + uWL.contains(10));
        System.out.println("contains list: " + uWL.containsAll(list));
        System.out.println("remove first: " + uWL.remove());
        System.out.println(uWL);
        System.out.println("contains list: " + uWL.containsAll(list));
        System.out.println("is empty: " + uWL.isEmpty());
    }
}
