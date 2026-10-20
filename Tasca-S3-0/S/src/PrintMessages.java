public class PrintMessages {

    public static String confirmationEmail(String email){
        return "Sending confirmation email to " + email ;
    }

    public static String userNoRegistered() {
        return "⚠️ User did not confirm registration.";
    }

    public static String registeredUser(){
        return "Registered user";
    }
}
