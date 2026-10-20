public class ViejoUser {
    import java.util.ArrayList;
import java.util.List;

    public class User {
        private final String name;
        private String email;
        private String password;

        //TODO Validar que los datos recibidos son correctos(no nuolo, no vacio), puede ser CLASE QUE VALIDE DATOS
        public User(String name, String email, String password) {
            //llamar a stringValidator con name, email y password

            BasicValidator.stringValidator(name);
            BasicValidator.stringValidator(email);
            BasicValidator.stringValidator(password);
            this.name = name;
            this.email = email;
            this.password = password;
        }

        public void register() {

            Email.emailValidator(email);
            //llamar a emailValidator

            Password.passwordValidator(password);
            //TODO CLASE password, llama a la clase con el metodo que valida datos, metodo que password sea correcto, xon estas condicones:, return boolena


            //TODO clase que tiene metodos que imprimen mensajes, clase solo para los print
            System.out.println("📧 Sending confirmation email to: " + email);
            //llamar a confirmatonEmail
            PrintMessages.confirmationEmail(email);


            //TODO hacer un metodo para esto en USER, sacarlo de register,  un true magico???, no ponerlo en el main porque es lo mismo, en cualquier momento el mnetodo s e puede cambiar
            boolean userConfirmed = true;

            //TODO este print viene de la clase mensaje
            if (!userConfirmed) {
                System.out.println("⚠️ User did not confirm registration.");
                return;
            }
        }


        public boolean userConfirmed(){

        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

    }

}
