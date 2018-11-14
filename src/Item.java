
import java.util.HashMap;
import java.util.TreeMap;
import java.util.SortedMap;


public class Item {
    private String name;
    private boolean exempt;
    private boolean imported;
    private int quant;
    private double pretax;


    /**
     * Constructor for product
     *
     * @param name name of item
     * @param exempt whether or not item is exempted from sales tax
     * @param imported whether or not item is imported
     * @param quant quantity of item
     */
    public Item(String name, double pretax, boolean exempt, boolean imported, int quant){
        this.name = name;
        this.exempt = exempt;
        this.imported = imported;
        this.quant = quant;
        this.pretax = pretax;
    }

    /**
     * Returns item name
     *
     * @return name of item
     */
    public String getName(){
        return name;
    }

    /**
     * Return item quantity
     *
     * @return quantity of item
     */
    public int getQuant(){
        return quant;
    }

    /**
     * Return price of item
     *
     * @return price of item
     */
    public double getPrice(){
        return pretax;
    }

    /**
     * Calculate tax of item
     *
     * @return rounded up tax
     */
    public double getTax(){
        double tax = pretax;
        if (imported && !exempt) {
            tax = pretax * 0.150;
        }else if (imported) {
            tax = pretax * 0.050;
        } else if (!exempt) {
            tax = pretax * 0.100;
        } else {
            return 0;
        }
        // This is used to round up tax
        tax = Math.ceil(tax * 20.0) / 20.0;
        return tax;
    }

}
