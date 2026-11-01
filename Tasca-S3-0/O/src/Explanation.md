Este ejercicio no cumplía el Principio de  abierto/cerrado porque, si se quisiera añadir otro instrumento, habría que modificar la clase `InstrumentPlayer` (la antigua) debido a todas las condiciones que contenía.

Como cada instrumento imprime algo diferente, creé una interfaz `PlayInstrument` con un método `play()`. Después, creé diferentes clases que representan cada uno de los instrumentos (`Guitar`, `Piano` y `Drums`), y cada clase implementa el método `play()` con su propio comportamiento; para hacerlo es mediante la clase `Musician`, esta clase no sabe qué instrumentos existen ni cuantos hay; solo sabe que todos cumplen el contrato `PlayInstrument` y llama a su `play()`.

Si en el futuro se quiere añadir otro instrumento, solo hay que crear una clase para este e implementar el método `play()` en ella. Así, no es necesario modificar el código existente ni afectar a las demás clases.

En el `main`, utilicé una referencia de tipo `Instrument` y llamé al método `play()` mediante `Musician`. De esta manera, se ejecuta el método `play()` del instrumento que corresponde al objeto, sin necesidad de utilizar condiciones `if/else`.