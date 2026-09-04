public class SaveToDb {
    
    int orderId;
    SaveToDb(int orderId){
        this.orderId = orderId;
    }

    public void saveToDatabase() {

        System.out.println("Connecting to MySQL...");
        System.out.println("Saving order " + orderId);
    }
}
