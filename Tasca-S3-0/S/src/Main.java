public class Main {

    static void main(String[] args) {

        User user1 = new User("MyName", "My@email.email", "MyPass123");

        Registration.registerUser(user1);

        if(!user1.isConfirmed()){
            PrintMessages.userNoRegistered();
        }

        PrintMessages.registeredUser();
    }
}
