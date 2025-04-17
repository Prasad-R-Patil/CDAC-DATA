package Assignment04;

public class Product extends Taxable {
    protected int pId;
    protected float price;
    protected int quantity;

   
    public Product() {}

   
    public Product(int pId, float price, int quantity) {
        this.pId = pId;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calTax() {
        float tax = (price * quantity * salesTax) / 100;
        System.out.println("Sales Tax for Product ID: " + pId + " is " + tax);
    }

   
    public void display() {
        System.out.println("Product ID: " + pId + ", Price: " + price + ", Quantity: " + quantity);
    }
}
