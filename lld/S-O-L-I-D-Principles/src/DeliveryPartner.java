public class DeliveryPartner {

  String deliveryType;
  
  public DeliveryPartner(String deliveryType) {
    this.deliveryType = deliveryType;
  }
  
  public void assignDeliveryPartner() {

        if (deliveryType.equals("BIKE")) {
            System.out.println("Assigning bike partner");
        }
        else if (deliveryType.equals("CAR")) {
            System.out.println("Assigning car partner");
        }
        else if (deliveryType.equals("BICYCLE")) {
            System.out.println("Assigning bicycle partner");
        }
    }

  
    public void deliver(Order order) {
        System.out.println("Delivering order");
    }

    public void calculateEarnings(Order order) {
        System.out.println("Calculating delivery earnings");
    }

    public void generateTaxReport() {
        System.out.println("Generating tax report");
    }
}
