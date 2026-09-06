
interface OrderRepository {
    void save(Order order);
}

class OrderRepositoryImpl implements OrderRepository {
    public void save(Order order) {
        System.out.println("Saving order " + order.getOrderId());
    }
}