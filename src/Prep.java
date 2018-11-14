import java.util.HashSet;
import java.util.Arrays;

public class Prep {
    private String prep;
    private HashSet<String> exempt;

    /**
     * Constructor for prep string
     * @param prep string before converted
     */
    public Prep(String prep) {
        this.prep = prep;
        this.exempt = new HashSet<String>(Arrays.asList("book", "chocolate", "pill"));
    }

    /**
     * Parse prep string into double price
     * @return price
     */
    public double getPrice() {
        int price = prep.lastIndexOf(" ");
        String prep_price = prep.substring(price + 1);
        return Double.parseDouble(prep_price);
    }

    /**
     * Parse prep string into name
     * @return name
     */
    public String getName() {
        int quant = prep.indexOf(" ");
        int name = prep.lastIndexOf("at");
        return prep.substring(quant + 1, name);
    }

    /**
     * Parse prep string into item quantity
     * @return quantity
     */
    public int getQuant() {
        int quant = prep.indexOf(" ");
        String ans = prep.substring(0, quant);
        return Integer.parseInt(ans);
    }

    /**
     * Parse prep string to determine if item is imported
     * @return import status
     */
    public boolean getImport() {
        return prep.contains("imported");
    }

    /**
     * Parse prep string to see if item is potentially an exempt item
     * @return exempt status
     */
    public boolean getExempt() {
        for (String s: exempt){
            if (prep.contains(s.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

}