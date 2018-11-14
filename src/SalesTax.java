
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class SalesTax {
    /**
     * Entry point to Program
     *
     * @param args argument can be used, but not neccessary
     * @throws FileNotFoundException
     */
    public static void main(String args[]) throws FileNotFoundException {
        Basket basket = new Basket();
        Scanner scanner;
        // If argument exists, use argument
        if (args.length > 0) {
            File file = new File(args[0]);
            scanner = new Scanner(file);
        }
        // If not, use pipe for standard input
        else {
            scanner = new Scanner(System.in);
        }


        // Use scanner to get string, prepare string to place into item
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            Prep p = new Prep(input);
            Item item = new Item(p.getName(),p.getPrice(), p.getExempt(), p.getImport(), p.getQuant());
            basket.addProduct(item);
        }

        basket.printReceipt();

    }
}
