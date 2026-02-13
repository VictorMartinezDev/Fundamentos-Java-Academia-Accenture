# Ejercios de practica Semana 1 academia Java Accenture

Durante la primera semana de academia estuvimos repasando algunos fundamentos escenciales de Java. Dentro de las actividades designadas se propusieron algunos
ejercicios para poner en practica los fundamentos vistos.

## Ejercicio 1. Hola mundo mejorado

Este programa es una evolución del clásico "Hola Mundo", enfocado en la declaración de variables de diferentes tipos y el uso de distintas técnicas de formateo de Strings en Java.
El objetivo principal es mostrar cómo manipular datos básicos y presentarlos de forma legible en la consola.

```Java
public static void main(String[] args)
```
**Descripción:** Es el punto de entrada de cualquier aplicación Java.

**Función:** Coordina la ejecución del programa. Dentro de este método se declaran las variables de tipo ```String```, ```int```, ```double``` y ```boolean```, y se ejecutan las llamadas a los métodos
de salida.

```Java
System.out.println(String x)
```

**Descripción:** Un método estándar de la biblioteca de Java para imprimir datos en la consola.

**Función:** Se utiliza dos veces en el código para mostrar los resultados de las variables procesadas. Imprime el mensaje y añade un salto de línea automático al final.

```Java
String.format(String format, Object... args)
```

**Descripción:** Un método estático de la clase String que permite crear cadenas de texto con un formato específico utilizando "especificadores de formato".
**Función:** En este proyecto, se usa para insertar de forma limpia las variables dentro de un texto base:
* ```%s```: Para cadenas de texto (```nombre```, ```estado```).

* ```%d```: Para números enteros (```edad```).

* ```%.2f```: Para números de punto flotante, limitándolos a 2 decimales (altura).
