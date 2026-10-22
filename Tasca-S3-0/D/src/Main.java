public class Main {
    static void main(String[] args) {
        Person person = new Person();

        PersonSaver saver = new MySQL();
        ServicePerson servPerson = new ServicePerson(saver);

        servPerson.save(person);
    }
}
