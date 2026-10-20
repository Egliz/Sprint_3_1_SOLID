public class User {
    private final String name;
    private final String email;
    private final String password;
    private boolean isConfirmed = false;


    public User(String name, String email, String password) {
        //TODO AQUI PONER EL BASICVALIDATOR
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void confirmedUser(){
        this.isConfirmed = true;
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

    public boolean getIsConfirmed(){
        return isConfirmed;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
