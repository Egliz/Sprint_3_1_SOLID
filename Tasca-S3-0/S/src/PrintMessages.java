public class PrintMessages {

    public static void confirmationEmail(String email){
        System.out.println("Sending confirmation email to " + email);
    }

    public static void userNoRegistered() {
        System.out.println("⚠️ User did not confirm registration.");
    }

    public static void registeredUser(){
        System.out.println("Registered user.");
    }
}
