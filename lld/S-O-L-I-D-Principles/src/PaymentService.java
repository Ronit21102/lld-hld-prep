interface IPaymentService {
    void processPayment();
    void refundPayment();
}

interface PaymentMethod{
    void process();
    void refund();
}
public class PaymentService implements IPaymentService {

    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
   
    @Override
    public void processPayment() {

       paymentMethod.process();
    }

    @Override
    public void refundPayment() {

       paymentMethod.refund();

    }
}

 class CardPayment implements PaymentMethod{
    
    @Override
    public void process() {
        System.out.println("Processing Card payment");
    }
    
    @Override
    public void refund() {
        System.out.println("Refunding Card payment");
    }
}

class UPIPayment implements PaymentMethod{
    
    @Override
    public void process() {
        System.out.println("Processing UPI payment");
    }
    
    @Override
    public void refund() {
        System.out.println("Refunding UPI payment");
    }
}


