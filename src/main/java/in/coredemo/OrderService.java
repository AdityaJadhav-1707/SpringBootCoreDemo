package in.coredemo;

import in.coredemo.notification.EmailService;
import in.coredemo.notification.NotificationService;
import in.coredemo.notification.Pop_upService;
import in.coredemo.notification.SmsService;

public class OrderService
{
//    EmailService notification = new EmailService();
//    SmsService notification1 = new SmsService();
//    NotificationService notification = new Pop_upService();
//    NotificationService notification1 = new SmsService();
//    NotificationService notification2 = new EmailService();
    NotificationService notification;
    public OrderService(NotificationService notification)
    {
        this.notification = notification;
    }


    public void placeOrder()
    {
        System.out.println("Order placed");
        notification.sendNotification();
//        notification1.sendNotification();
//        notification2.sendNotification();


    }
}
