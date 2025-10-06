package arrayListDemo;
import java.util.ArrayList;

public class ProductInventoryDemo {
    public static void main(String[] args) {
        ArrayList<Integer> quantities = new ArrayList<>();

        quantities.add(10);
        quantities.add(20);
        quantities.add(15);
        quantities.add(25);

        System.out.println("Initial Quantities: " + quantities);

        quantities.set(1, 30);
        System.out.println("After updating index 1: " + quantities);

       
        int total = 0;
        for (int qty : quantities) {
            total += qty;
        }
        System.out.println("Total Quantity in Store: " + total);

       
        quantities.clear();
        System.out.println("After clearing: " + quantities);
    }
}
