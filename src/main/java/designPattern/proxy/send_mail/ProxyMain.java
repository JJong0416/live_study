package designPattern.proxy.send_mail;

public class ProxyMain {
    public static void main(String[] args) {
        MailSender mailSender = new ProxyMailSender();
        mailSender.send("Hello world!");
    }
}
