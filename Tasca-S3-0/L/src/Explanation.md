El problema era que el metodo `takeDamage` en `Ghost`, lanzaba una excepción, y si se llama el metodo `takeDamage` con `Ghost` falla, eso rompe Liskov, porque la clase hija no cumple lo que promete el padre, y Liskov dice que una hija tiene que poder sustituir al padre sin romper el programa.

Lo que hice fue sacar el metodo `takeDamage` de `Character` y ponerlo en una interfaz `Damage`, y implementar esa interfaz solo en `Warrior`. El padre ya no promete algo que `Ghost` no puede cumplir.

Si añado otro personaje que sí reciba daño, solo tengo que implementar `Damage` en su clase sin tocar las demás.