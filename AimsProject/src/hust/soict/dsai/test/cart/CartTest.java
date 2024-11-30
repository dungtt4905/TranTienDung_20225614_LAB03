package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims1.cart.Cart;
import hust.soict.dsai.aims1.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        //Create a new cart
        Cart cart = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        cart.addDigitalVideoDisc(dvd3);

        //Test the print method
        cart.print();

        //To-do: Test the search method
        //Search by ID
        cart.searchCart(1);
        cart.searchCart(10);
        
        //Search by Title
        cart.searchCart("Star Wars");
        cart.searchCart("One Piece");
    }
}