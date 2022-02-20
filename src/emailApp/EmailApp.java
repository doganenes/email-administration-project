package emailApp;

// main class
public class EmailApp {

    public static void main(String[] args) {
        Email email1 = new Email("Lale", "Güneşli");
        email1.setAlternateEmail("lalegunesli012@gmail.com");
        email1.setMailboxCapacity(400);
        System.out.println("Get alternate email is: " + email1.getAlternateEmail());
        System.out.println();
        System.out.println(email1.showInfo());
        System.out.println();
        Email email2 = new Email("Emir", "Duman");
        System.out.println(email2.showInfo());

    }

}
