public class Email {

    public static void emailValidator(String emailToValidated) {
        if (!emailToValidated.contains("@") || !emailToValidated.contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

    }
}
