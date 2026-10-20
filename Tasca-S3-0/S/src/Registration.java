public class Registration {

    public static boolean register(User user){

            Email.emailValidator(user.getEmail());
            Password.passwordValidator(user.getPassword());

            PrintMessages.confirmationEmail(user.getEmail());

            if(!user.getIsConfirmed()){

            }
        }


}
