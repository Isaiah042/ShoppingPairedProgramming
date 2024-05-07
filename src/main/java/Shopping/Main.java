package Shopping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        User user = new User();

        Product hat1 = new Hat(1, Size.XL, 5.00, "hat", 10);
        Food fries1 = new Fries(1, Size.L, 10.00, "shirt", 11);
        Product shirt1 = new Shirt(1, Size.L, 3.00, "fries", 15);
        user.addToCart(hat1, 5);
        user.addToCart(shirt1,0);
        user.addToCart(fries1, 7);
        System.out.println();


        user.removeFromCart(hat1, 5);
        System.out.println();


        System.out.println(user.getCart().getProducts());
        System.out.println();

        System.out.println(user.getCart().cartQty());
        System.out.println(user.getCart().subTotal());
        System.out.println(user.getCart().totalAfterTax());
        user.getCart().checkOut();

        System.out.println();
        user.getCart().checkSaleDay(Special.SUN);
        System.out.println("Are fries perishable?" + " " + fries1.isPerishable());




    }


}
