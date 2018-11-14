/**
 * Created by eunsangg10 on 11/14/18.
 */
import java.util.ArrayList;


public class Basket {
    private ArrayList<Item> items;

    public Basket(){
        this.items = new ArrayList<>();
    }
    public void addProduct(Item item) {
        items.add(item);
    }

    public void printReceipt(){
        double salestax = 0;
        double total = 0;
        for (Item p: items){
            double posttax = p.getPrice() + p.getTax();
            String ans = String.format("%d %s: %.2f", p.getQuant(), p.getName(), posttax);
            salestax += p.getTax() * p.getQuant();
            total += posttax * p.getQuant();
            System.out.println(ans);
        }
        System.out.printf("Sales Taxes: %.2f\n", salestax);
        System.out.printf("Total: %.2f\n", total);
    }
}
