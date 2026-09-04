interface IPaymentService {
    void processPayment();
    void refundPayment();
}
public class PaymentService implements IPaymentService {

    private String paymentMethod;

    public PaymentService(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
   
    @Override
    public void processPayment() {

        if (paymentMethod.equals("CARD")) {
            System.out.println("Processing Card payment");
        }
        else if (paymentMethod.equals("UPI")) {
            System.out.println("Processing UPI payment");
        }
        else if (paymentMethod.equals("PAYPAL")) {
            System.out.println("Processing PayPal payment");
        }
        else if (paymentMethod.equals("CASH")) {
            System.out.println("Cash on delivery");
        }
    }

    @Override
    public void refundPayment() {

        if (paymentMethod.equals("CARD")) {
            System.out.println("Refunding Card payment");
        }
        else if (paymentMethod.equals("UPI")) {
            System.out.println("Refunding UPI payment");
        }
        else if (paymentMethod.equals("PAYPAL")) {
            System.out.println("Refunding PayPal payment");
        }
        else {
            System.out.println("Refund not supported");
        }
    }
}
