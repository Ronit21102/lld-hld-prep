public class Restaurant {

    public void acceptOrder(Order order) {
        System.out.println("Restaurant accepted order");
    }

    public void prepareOrder(Order order) {
        System.out.println("Preparing food");
    }

    public void calculateCommission(Order order) {
        System.out.println("Calculating restaurant commission");
    }

    public void generateReport() {
        System.out.println("Generating restaurant report");
    }
}