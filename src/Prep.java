/**
 * Created by eunsangg10 on 11/14/18.
 */
import java.util.HashSet;
import java.util.Arrays;

public class Prep {
    private String prep;
    private HashSet<String> exempt;

    public Prep(String prep) {
        this.prep = prep;
        this.exempt = new HashSet<String>(Arrays.asList("book", "chocolate", "pill"));
    }

    public double getPrice() {
        int price = prep.lastIndexOf(" ");
        String prep_price = prep.substring(price + 1);
        return Double.parseDouble(prep_price);
    }

    public String getName() {
        int quant = prep.indexOf(" ");
        int name = prep.lastIndexOf("at");
        return prep.substring(quant + 1, name);
    }

    public int getQuant() {
        int quant = prep.indexOf(" ");
        String ans = prep.substring(0, quant);
        return Integer.parseInt(ans);
    }

    public boolean getImport() {
        return prep.contains("imported");
    }
    public boolean getExempt() {
        for (String s: exempt){
            if (prep.contains(s.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

}