

interface NotificationType {
    void sendNotification();
}

public class NotificationService  {
    
    private NotificationType notificationType;
    private String customerEmail;
    private String customerPhone;
    
    public NotificationService(NotificationType notificationType, String customerEmail, String customerPhone) {
        this.notificationType = notificationType;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }
    
    public void sendNotification() {
        notificationType.sendNotification();
    }

}

class EmailNotification implements NotificationType {
    @Override
    public void sendNotification() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements NotificationType {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification implements NotificationType {
    @Override
    public void sendNotification() {
        System.out.println("Sending Push Notification");
    }
}
