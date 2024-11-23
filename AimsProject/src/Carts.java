
import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> digitalVideoDiscs = new ArrayList<>();
    private int qtyOrdered = 0;

    // Add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            digitalVideoDiscs.add(disc);
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added to the cart.");
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    // Remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (digitalVideoDiscs.remove(disc)) {
            qtyOrdered--;
            System.out.println("The disc " + disc.getTitle() + " has been removed from the cart.");
        } else {
            System.out.println("The disc was not found in the cart.");
        }
    }

    // Calculate total cost of DVDs in the cart
    public double totalCost() {
        double total = 0.0;
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            total += disc.getCost();
        }
        return total;
    }

    // Display cart contents
    public void displayCart() {
        System.out.println("Cart Contents:");
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            System.out.println(disc.toString());
        }
        System.out.println("Total items: " + qtyOrdered);
    }
}
