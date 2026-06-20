package in.coredemo;

import in.coredemo.notification.EmailService;
import in.coredemo.notification.NotificationService;
import in.coredemo.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NotificationService notification = new EmailService();
        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}
