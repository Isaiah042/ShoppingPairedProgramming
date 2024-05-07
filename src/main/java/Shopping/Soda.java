package Shopping;

public class Soda extends Food{

    private int inventory;

    public Soda(int ID, Size size, double price, String name, int inventory) {
        super(ID, size, price, name, inventory);
        this.inventory = inventory;
    }

    @Override
    public boolean isPerishable() {
        return true;
    }
}
