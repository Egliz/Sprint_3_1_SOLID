public class Registration {

    public static void registerUser(User user){

            Email.emailValidator(user.getEmail());
            Password.passwordValidator(user.getPassword());

            PrintMessages.confirmationEmail(user.getEmail());

    }
}
