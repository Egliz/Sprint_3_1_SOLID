Este ejercicio no cumplía el Principio de responsabilidad abierta/cerrada porque, si se quisiera añadir otro instrumento, habría que modificar la clase `InstrumentPlayer` debido a todas las condiciones que contenía.

Como cada instrumento imprime algo diferente, creé una interfaz `PlayInstrument` con un método `play()`. Después, creé diferentes clases que representan cada uno de los instrumentos (`Guitar`, `Piano` y `Drums`), y cada clase implementa el método `play()` con su propio comportamiento.

Si en el futuro se quiere añadir otro instrumento, solo hay que crear una clase para este e implementar el método `play()` en ella. Así, no es necesario modificar el código existente ni afectar a las demás clases.

En el `main`, utilicé una referencia de tipo `Instrument` y llamé al método `play()`. De esta manera, se ejecuta el método `play()` del instrumento que corresponde al objeto, sin necesidad de utilizar condiciones `if/else`.