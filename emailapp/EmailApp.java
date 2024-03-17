package emailapp;

public class EmailApp {

    public static void main(String[] args){
        Email employ1 = new Email("Muhydeen", "Adelani");
        System.out.println(employ1.showInfo());

       // employ1.setAlternateEmail("mo.adelani@gmail.com");
        // System.out.println(employ1.getAlternateEmail());

    }
}
