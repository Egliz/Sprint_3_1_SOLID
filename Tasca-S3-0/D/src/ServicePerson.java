public class ServicePerson {
        private PersonSaver saver;

        public ServicePerson(PersonSaver saver) {
            this.saver = saver;
        }

        public void savePersonaaaa(Person person){
            saver.savePerson(person);
        }

      /*  //TODO ServicePerson depende de Mysql
        MySql mysql = new MySql();
        mysql.savePerson(person);
        */
}
