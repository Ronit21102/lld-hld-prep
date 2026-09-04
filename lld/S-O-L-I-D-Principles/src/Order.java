
import java.util.*;

public class Order {

    private int orderId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    private List<String> items = new ArrayList<>();


    public Order(
            int orderId,
            String customerName,
            String customerEmail,
            String customerPhone
            ) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public double calculateTotal() {

        double total = 0;

        for (String item : items) {
            total += 200;
        }

        if (items.size() >= 5) {
            total = total * 0.9;
        }

        return total;
    }

   
    public void generateInvoice() {

        System.out.println("Generating PDF invoice...");
    }


    public void printOrderSummary() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);

        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("Total: " + calculateTotal());
    }
}
