public class Main {
    static void main(String[] args) {
        Person person = new Person();

        PersonSaver saver = new MySql();
        ServicePerson servPerson = new ServicePerson(saver);

        servPerson.save(person);
    }
}
