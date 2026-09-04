🛒 SOLID Practice Problem — Food Delivery System

Imagine you're working on a food-delivery application like Swiggy/Zomato.

🎯 Your requirements

Now imagine the product manager gives you these changes:

Change 1

We want to add:

Apple Pay
Google Pay
Stripe

without repeatedly modifying the existing payment logic.

Change 2

We want notifications through:

Email
SMS
Push Notification
WhatsApp

and potentially more channels later.

Change 3

We want to support:

Bike delivery
Car delivery
Bicycle delivery
Drone delivery
Change 4

The database team says:

"We're moving from MySQL to PostgreSQL."

Your order business logic shouldn't need to know which database is being used.

Change 5

The invoice team wants:

PDF
HTML
Excel
Change 6

We want to unit-test FoodDeliverySystem without actually:

charging a payment
sending an SMS
connecting to a database
delivering an order
Change 7

A new requirement comes:

Some delivery partners can deliver, but some third-party partners can only pick up orders.

Change 8

Restaurant management wants:

commission calculation
restaurant reports
restaurant notifications

to evolve independently from order management.

🧠 Your challenge

Do NOT start by saying "SRP is violated here, OCP is violated there..."

I want you to develop the mental process we discussed:

Code → identify smell → understand why → identify principle → refactor

Step 1 — Analyze

Tell me all the design problems you notice in this code.

For each problem, explain:

"X is doing A, B, and C. These things can change independently, so this creates a problem because..."

Step 2 — Identify

Only after that, tell me which SOLID principle(s) you think are applicable.

There may be more than one principle involved in the same area.

Step 3 — Design

Before writing code, draw/explain your proposed class structure.

For example:

FoodDeliverySystem
        |
        v
     ??????
      /  \
     /    \
   ???    ???
Step 4 — Refactor

Then write the C++ implementation.

I'll interview you during the refactoring rather than immediately giving you the answer.

And I won't tell you:

"This is an SRP problem."

I'll instead ask things like:

"What happens if we add WhatsApp notifications? Which existing class would need to change?"

That's where I want you to start recognizing the principle yourself.


import java.util.*;

class Order {

    private int orderId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    private List<String> items = new ArrayList<>();

    private String paymentMethod;
    private String notificationType;
    private String deliveryType;

    public Order(
            int orderId,
            String customerName,
            String customerEmail,
            String customerPhone,
            String paymentMethod,
            String notificationType,
            String deliveryType) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.paymentMethod = paymentMethod;
        this.notificationType = notificationType;
        this.deliveryType = deliveryType;
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

    public void sendNotification() {

        if (notificationType.equals("EMAIL")) {
            System.out.println(
                    "Sending Email to " + customerEmail);
        }
        else if (notificationType.equals("SMS")) {
            System.out.println(
                    "Sending SMS to " + customerPhone);
        }
        else if (notificationType.equals("PUSH")) {
            System.out.println("Sending Push Notification");
        }
    }

    public void saveToDatabase() {

        System.out.println("Connecting to MySQL...");
        System.out.println("Saving order " + orderId);
    }

    public void generateInvoice() {

        System.out.println("Generating PDF invoice...");
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

    public void printOrderSummary() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);

        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("Total: " + calculateTotal());
    }
}


class Restaurant {

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


class DeliveryPartner {

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


class FoodDeliverySystem {

    public void placeOrder(Order order) {

        order.processPayment();

        order.saveToDatabase();

        order.sendNotification();

        order.generateInvoice();

        Restaurant restaurant = new Restaurant();

        restaurant.acceptOrder(order);
        restaurant.prepareOrder(order);

        DeliveryPartner partner = new DeliveryPartner();

        order.assignDeliveryPartner();

        partner.deliver(order);

        System.out.println("Order completed");
    }

    public void cancelOrder(Order order) {

        order.refundPayment();

        System.out.println("Order cancelled");
    }
}