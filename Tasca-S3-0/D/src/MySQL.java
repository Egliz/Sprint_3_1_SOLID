public class MySql implements PersonSaver{

    @Override
    public void savePerson(Person person) {
        System.out.println("Save person ok...");
   }
}