package Shopping;

import java.util.ArrayList;

public class User {

    private static final int id = 0;
    private int sharedID;
    private Cart cart;

    public User() {
        cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public void addToCart(Product product, int qty) {
        if (product.getInventory() >= qty) {
            for (int i = 0; i < qty; i++) {
                cart.getProducts().add(product);
                int x = product.getInventory() - 1;
                product.setInventory(x);
                System.out.println("Added to cart: " + product.toString());
            }
        } else {
            System.out.println("Out of stock.");
        }
    }

    public int removeFromCart(Product product, int qty) {
        if (cart.getProducts().contains(product)) {
            int totalRemoved = 0;
            if (cart.getProducts().contains(product)) {
                for (int i = 0; i < qty; i++) {
                    if (cart.getProducts().remove(product)) {
                        totalRemoved++;
                        int inventory = product.getInventory();
                        product.setInventory(inventory - 1);
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println("Sorry, product was not found in the cart.");
            }
            System.out.println("Total items removed: " + totalRemoved);
            return totalRemoved;
        }
        return qty;
    }

}
