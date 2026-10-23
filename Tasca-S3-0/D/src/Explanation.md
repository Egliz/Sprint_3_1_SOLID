Este ejercicio no cumplía el `Principio de inversión de dependencias`, porque la clase `ServicePerson` dependía directamente de la clase `MySQL`, si en un futuro quisiera cambiar de `MySQL` a otra clase, tendría que tocar `ServicePerson`; eso tampoco es escalable ni eficiente.

Hice una interfaz `PersonSaver`, solo con la firma del método que se estaba usando en `ServicePerson`. En la clase `MySQL` implementé esa interfaz y ahí implementé lo que tiene que hacer el método.

En `ServicePerson` hice un campo de tipo `PersonSaver`(la interfaz) porque a través de esa interfaz es que se invocará al método, si dejo el `new MySQL`, seguiría dependiendo de MySQL.

En el Main creo un objeto de tipo `PersonSaver` con la clase concreta `MySQL` (PersonSaver saver = new MySql()), y se lo paso al constructor de `ServicePerson`. Así `ServicePerson` puede usar el método sin saber que es `MySQL`. Si en el futuro quiero cambiar la clase, solo cambio el `new` en el Main, y el programa sigue funcionando