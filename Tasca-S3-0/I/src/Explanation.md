Este ejercicio no cumplía el Principio de Segregación de Interfaces porque la interfaz `MachineActions` tenia algunos métodos que no eran necesarios en las clases que lo implementaban y ninguna clase debería depender de métodos que no necesita.

Lo que hice fue separar esa interfaz grande en interfaces más pequeñas y específicas, cada una con los métodos que realmente van juntos. Así, cada clase implementa solo las interfaces  de los métodos que necesita.
