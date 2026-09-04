interface INotificationService {
    void sendNotification();
}

public class NotificationService implements INotificationService {
    
    private String notificationType;
    private String customerEmail;
    private String customerPhone;
    
    public NotificationService(String notificationType, String customerEmail, String customerPhone) {
        this.notificationType = notificationType;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }
    
    @Override
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
}
