public class User {
    private final String name;
    private final String email;
    private final String password;
    private boolean isConfirmed = false;


    public User(String name, String email, String password) {
        BasicValidator.stringValidator(name);
        BasicValidator.stringValidator(email);
        BasicValidator.stringValidator(password);
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

    public boolean isConfirmed(){
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
