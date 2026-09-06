
interface DeliveryVehicleType {
    void assignDeliveryPartner();
}


public class DeliveryPartner  {

  
   private DeliveryVehicleType deliveryType;
  
  public DeliveryPartner(DeliveryVehicleType deliveryType) {
    this.deliveryType = deliveryType;
  }
  
  public void assignDeliveryPartner() {
      deliveryType.assignDeliveryPartner();
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


class BikePartner implements DeliveryVehicleType {
    @Override
    public void assignDeliveryPartner() {
        System.out.println("Assigning bike partner");
    }
}

class CarPartner implements DeliveryVehicleType {
    @Override
    public void assignDeliveryPartner() {
        System.out.println("Assigning car partner");
    }
}

class BicyclePartner implements DeliveryVehicleType {
    @Override
    public void assignDeliveryPartner() {
        System.out.println("Assigning bicycle partner");
    }
}
