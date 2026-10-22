public class ServicePerson {
    public void savePerson(Person person) {

        //TODO ServicePerson depende de Mysql
        MySql mysql = new MySql();
        mysql.savePerson(person);
    }
}
