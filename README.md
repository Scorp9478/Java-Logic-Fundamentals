# Java-Logic-Fundamentals
Este repositorio contiene mi progreso en el dominio de la lógica de programación con Java, avanzando desde algoritmos básicos hasta la gestión profesional de excepciones y memoria. Mi objetivo final es aplicar estos conocimientos para la construcción de un emulador de GameBoy.

Proyecto: Guess The Number

Implementación de un sistema de adivinanza numérica con enfoque en la robustez del código y la gestión de excepciones en tiempo de ejecución.
Características Técnicas

  Gestión de Excepciones: Uso de bloques try-catch para interceptar InputMismatchException, permitiendo que el programa recupere el flujo normal tras una entrada de datos inválida.

  Manejo del Buffer de Entrada: Implementación de sc.next() para la limpieza del flujo del Scanner, evitando bloqueos por datos residuales.

  Optimización de Historial: Gestión de arrays mediante un puntero de posición para garantizar que la salida de datos refleje únicamente los intentos reales del usuario, omitiendo posiciones nulas.

Control de Recursos: Gestión manual del ciclo de vida del Scanner, asegurando el cierre del recurso únicamente tras la finalización del bucle principal para evitar estados ilegales.

  Conceptos Aplicados
  
  Control de flujo mediante bucles while condicionales.
  
  Lógica de comparación de proximidad para feedback de usuario.
  
  Estructuras de datos estáticas (Arrays).
  
  Gestión de excepciones para mejorar la resiliencia del software.
