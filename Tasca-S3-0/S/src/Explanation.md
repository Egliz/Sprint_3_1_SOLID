La clase `User` hacía muchas cosas: validaba el email, validaba la contraseña, imprimía mensajes y registraba. Aunque el email y la contraseña sean del usuario, el hecho de validarlos ahí dentro rompe el `Principio de Responsabilidad Única`. Además, imprimir mensajes no tiene nada que ver con registrar.

Hice `BasicValidator` con un método `stringValidator` para los casos básicos (que no sea nulo y que no esté en blanco). Lo usa el constructor de `User`.

Hice `Email` con un método `emailValidator` que comprueba las cosas específicas del email, lo que comprobaba la clase `User` (que tenga @ y .)

Hice `Password` con un método `passwordValidator` que comprueba las cosas específicas de la contraseña, lo que comprobaba la clase `User` (longitud mínima y mayúscula). En el mismo método agregue que compruebe si tiene números.

Hice `PrintMessages` con los métodos que imprimen los mensajes.

`User` lo dejé con los atributos que tenía (name, email, password), con los getters, y añadí el atributo `isConfirmed` y su método `confirmedUser` (que pone `isConfirmed` a true). En el original, esta variable tenia otro nombre (userConfirmed) y ya tenia el valor `true` fijo; ahora empieza en false.

Hice `Registration` con un método `registerUser` que valida el email, valida la contraseña (Password), e imprime el mensaje (PrintMessages).

En el main creé el objeto `user`, llamé a `Registration.register(user)` para registrarlo, y luego llamé a `user.confirmedUser()` para poner `isConfirmed` a true; e imprime el mensaje de que el usuario está registrado.
