package Assignment04;

public abstract class Taxable {
    protected final float salesTax = 7.0f;
    protected final float incomeTax = 19.5f;

    
    public abstract void calTax();

   
    public void calTax(Taxable[] items) {
        for (Taxable item : items) {
            item.calTax();
        }
    }
}
