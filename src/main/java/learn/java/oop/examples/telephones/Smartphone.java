package learn.java.oop.examples.telephones;

public class Smartphone extends MobilePhone{
    public Smartphone(String number) {
        super(number);
    }

    public void makeCall(String appName, String targetNumber){
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}
