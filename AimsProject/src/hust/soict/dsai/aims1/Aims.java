package hust.soict.dsai.aims1;

import hust.soict.dsai.aims1.cart.Cart;
import hust.soict.dsai.aims1.disc.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        // Create a new Cart object
        Cart cart = new Cart();
        
        // Example: Creating new DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("1", "The Matrix", "Action", "Wachowski", 136, 14.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("2", "Toy Story", "Animation", "Lasseter", 81, 19.99);
        
        // Adding DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd1, dvd2);

        cart.addDigitalVideoDisc(dvd2);

        // Display cart content
        cart.displayCart();

        // Display total cost
        System.out.println("Total cost: $" + cart.totalCost());

        // Example of removing a DVD
        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("After removing 'The Matrix':");
        cart.displayCart();
        System.out.println("Total cost: $" + cart.totalCost());
    }
}
