public class Main {

    public static void main(String[] args) {
        User user = new User("MyName", "My@email.email", "MyPass123");

        Registration.registerUser(user);
        user.confirmedUser();

        if(!user.getIsConfirmed()){
            PrintMessages.userNoRegistered();
        } else {
            PrintMessages.registeredUser();
        }
    }
}
