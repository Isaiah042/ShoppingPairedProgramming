package Shopping;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    private final float TAX = .25f;
    private Special special;


    public Cart() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    @Override
    public String toString() {
        return "Cart {" +
                "Products= " + products +
                '}';
    }

    public Integer cartQty() {
        int x = products.size();
        return x;
    }

    public double subTotal() {
        double total = 0;
        for (Product items : products) {
            double price = items.getPrice();
            total += price;
        }
        return total;
    }

    public double totalAfterTax() {
        double total = 0;
        float tax = TAX;
        for (Product product : products) {
            double price = product.getPrice();
            total += price;
        }
        return total + (total * tax);
    }

    public void checkOut() {
        System.out.println("Have a great day!!");
    }


    public void checkSaleDay(Special day) {
        special = day;
        switch (special) {
            case MON:
                System.out.println("1% off");
                break;
            case TUE:
                System.out.println("2% off");
                break;
            case WED:
                System.out.println("3% off");
                break;
            case TH:
                System.out.println("4% off");
                break;
            case FR:
                System.out.println("6% off");
                break;
            case SAT:
                System.out.println("20% off");
                break;
            case SUN:
                System.out.println("80% off!");
                break;
        }
    }
}