public class Password {

    public static void passwordValidator(String passwordToValidated) {
        if (passwordToValidated.length() < 8 || !passwordToValidated.matches(".*[A-Z].*") || (!passwordToValidated.matches(".*[0-9]*.")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter and number.");
        }
    }
}
