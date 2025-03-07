package hust.soict.dsai.aims1.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims1.disc.DigitalVideoDisc;
public class Cart {
    private ArrayList<DigitalVideoDisc> digitalVideoDiscs = new ArrayList<>();
    private int qtyOrdered = 0;

    // Add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            DigitalVideoDisc.add(disc);
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added to the cart.");
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if (qtyOrdered + dvdList.length <= 20) {
            for (DigitalVideoDisc dvd : dvdList) {
                digitalVideoDiscs.add(dvd);
                qtyOrdered++;
                System.out.println("The disc \"" + dvd.getTitle() + "\" has been added to the cart.");
            }
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= 20) {
            digitalVideoDiscs.add(dvd1);
            qtyOrdered++;
            digitalVideoDiscs.add(dvd2);
            qtyOrdered++;
            System.out.println("\"" + dvd1.getTitle() + "\" and \"" + dvd2.getTitle() + "\" have been added to the cart.");
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

    // New method to display ordered items and total price
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int itemNumber = 1;
        for (DigitalVideoDisc disc : digitalVideoDiscs) {
            System.out.println(itemNumber + ". DVD - " + disc.getTitle() + " - " + disc.getCategory() + 
                " - " + disc.getDirector() + " - " + disc.getLength() + ": " + disc.getCost() + " $");
            itemNumber++;
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

	public void displayCart() {
		// TODO Auto-generated method stub
		
	}
}
