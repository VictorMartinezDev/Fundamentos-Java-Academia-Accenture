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

# Ejercicio 2. Calculadora basica

Este ejercicio demuestra la capacidad de Java para definir múltiples métodos con el mismo nombre pero con diferentes parámetros. El programa implementa una serie de métodos estáticos para realizar operaciones de suma, adaptándose automáticamente según el tipo o la cantidad de datos que se le envíen.

## Métodos utilizados (sobrecarga)

### 1. ```sumar(int a, int b)```
* **Descripción:** La versión mas basica del método.

* **Función:** Recibe dos números enteros y retorna su suma. Se activa cuando pasamos parámetros como ```sumar(2, 3)```.

### 2. ```sumar(double a, double b)```

* **Descripción:** Versión para números de punto flotante.

* **Función:** Permite realizar sumas con decimales. Java identifica automáticamente que debe usar este método cuando los argumentos son de tipo ```double``` (ej. 2.5, 3.7).

### 3. ```sumar(int a, int b, int c)```

* **Descripción:** Versión con tres parámetros.

* **Función:** Demuestra que la sobrecarga no solo depende del tipo de dato, sino también de la cantidad de parámetros. Retorna la suma de tres enteros.

### 4. ```sumar(int[] numeros)```

* **Descripción:** Versión que acepta un arreglo (array).

* **Función:** Utiliza un bucle **for-each** para recorrer una colección de números enteros y acumular su total. Es ideal para sumar una lista indeterminada de valores previamente agrupados.

##Conceptos Clave Aprendidos

* **Polimorfismo Estático (Sobrecarga):** La capacidad del compilador para decidir qué método ejecutar basándose en la "firma" del método (nombre + parámetros).

* **Bucle For-Each:** Implementado en la suma del array para iterar de manera limpia y eficiente sobre los elementos de la colección.

* **Métodos Estáticos:** El uso de la palabra reservada ```static``` permite llamar a estos métodos sin necesidad de crear una instancia (objeto) de la clase ```Calculadora```.

## Ejercicio 3. Clasificador de números

Este programa tiene como objetivo realizar un análisis estadístico completo sobre un conjunto de números enteros almacenados en un arreglo. A través de un único recorrido del array, el código es capaz de extraer múltiples métricas como la frecuencia de tipos de números, valores extremos y medidas de tendencia central.

###Lógica utilizada

### ```clasificar(int[] numeros)```

* **Descripción:** Es el método principal de procesamiento que contiene la lógica de negocio.

* **Función:** Recibe un arreglo de enteros y utiliza un bucle for-each para realizar las siguientes tareas en una sola pasada:

* **Conteo de polaridad:** Identifica si el número es positivo, negativo o cero mediante una estructura if-else.

* **Análisis de paridad:** Determina si un número es par o impar utilizando el operador de módulo ```(% 2 == 0)```.

* **Búsqueda de extremos:** Actualiza los valores de mayor y menor comparando el número actual con los registros previos.

* **Acumulación:** Suma el valor actual a una variable totalizadora para el posterior cálculo estadístico.

### Conceptos Clave Aprendidos

* **Inicialización de Extremos:** Se utilizan las constantes ```Integer.MIN_VALUE``` e ```Integer.MAX_VALUE``` para asegurar que las comparaciones de mayor y menor funcionen correctamente sin importar el rango de los números en el array.

* **Casting (Conversión de tipos):** Al calcular el promedio, se realiza un casteo explícito a ```(double)``` para evitar la división entera y obtener un resultado con precisión decimal.

* **Formateo de Salida ```(System.out.printf)```:** Se emplea el especificador ```%.2f``` para mostrar el promedio limitado a dos decimales y ```%n``` para un salto de línea multiplataforma.

## Ejercicio 3. Manipulador de Strings

Este programa explora las capacidades de Java para el procesamiento de texto, combinando métodos de la clase String con la eficiencia de StringBuilder. El ejercicio abarca desde lógica algorítmica (palíndromos y conteo) hasta la generación de patrones visuales.

### Métodos utilizados

### 1. ```invertir(String s)```

* **Descripción:** Invierte el orden de los caracteres de una cadena.

* **Función:** Utiliza la clase ```StringBuilder``` y su método optimizado ```.reverse()```. Es mucho más eficiente que invertir una cadena mediante un bucle manual, ya que evita la creación de múltiples objetos intermedios en el String Pool.

### 2. ```esPalindromo(String s)```

* **Descripción:** Determina si una frase se lee igual de izquierda a derecha que de derecha a izquierda.

* **Función:** Realiza una limpieza de la cadena usando ```.toLowerCase()``` y ```.replaceAll(" ", "")``` para ignorar mayúsculas y espacios. Luego, utiliza el método ```invertir``` creado previamente para realizar la comparación lógica.

### 3. ```contarVocales(String s)```

* **Descripción:** Contabiliza la aparición de vocales en un texto.

* **Función:** Convierte el String en un arreglo de caracteres (```toCharArray```) y emplea un bucle anidado para comparar cada letra contra una cadena de referencia que contiene todas las vocales (tanto minúsculas como mayúsculas).

### 4. ```construirPiramide(int niveles)```

* **Descripción:** Genera una representación visual de una pirámide mediante asteriscos.

* **Función:** Hace uso intensivo de ```StringBuilder``` para construir el patrón fila por fila. Utiliza el método ```.repeat()``` para calcular y agregar dinámicamente los espacios y asteriscos necesarios según el nivel actual, optimizando la construcción del salto de línea final.

### Conceptos aprendidos

* **StringBuilder vs String:** Aprendizaje sobre la mutabilidad. Se utiliza ```StringBuilder``` para operaciones que requieren modificar texto repetidamente, evitando el alto costo de memoria de los Strings inmutables.

* **Expresiones Regulares Básicas:** Uso de ```replaceAll(" ", "")``` para la limpieza de datos, un concepto esencial en el preprocesamiento de información.

* **Manipulación de Colecciones de Caracteres:** Uso de ```toCharArray()``` para tratar cadenas como estructuras iterables.

## 5. Gestión de estudiantes

Este programa implementa un modelo básico de gestión académica. A través de la clase ```Estudiante```, se demuestra cómo agrupar datos (atributos) y comportamientos (métodos) en una sola unidad, además de utilizar estructuras de datos dinámicas para manejar información que puede crecer con el tiempo.

### Métodos y Estructura de la Clase

### 1. Constructor: ```Estudiante(String nombre, String matricula)```

* **Descripción:** El método especial que se ejecuta al crear una nueva instancia de la clase.

* **Función:** Inicializa los atributos del estudiante y, fundamentalmente, instancia la lista calificaciones como un ```ArrayList```. Esto asegura que cada objeto tenga su propio espacio de memoria para almacenar notas.

### 2. ```agregarCalificacion(double cal)```

* **Descripción:** Un método de instancia que actúa como filtro de seguridad (validación).

* **Función:** Verifica que la calificación se encuentre en el rango lógico de 0 a 100 antes de permitir que se guarde en la lista. Si el valor es inválido, muestra un mensaje de error en lugar de procesar el dato.

### 3. ```calcularPromedio()```

* **Descripción:** Un método que procesa la colección de datos interna.

* **Función:** Recorre la lista de calificaciones para obtener la suma total y la divide entre el tamaño de la lista (```size()```). Incluye un control de seguridad para retornar 0.0 si el estudiante aún no tiene notas cargadas, evitando errores de división por cero.

### 4. ```@Override toString()```

* **Descripción:** Una sobreescritura del método estándar de la clase ```Object```.

* **Función:** Personaliza cómo se representa el objeto cuando se imprime. En lugar de mostrar la dirección de memoria, devuelve una cadena formateada con el nombre, matrícula y el promedio calculado en tiempo real.

### Conceptos Clave Aprendidos

* **Encapsulamiento:** El uso de modificadores de acceso ```private``` para proteger los datos de la clase, exponiendo solo lo necesario a través de métodos públicos.

* **Collections Framework:** Uso de ```List``` (Interfaz) y ```ArrayList``` (Implementación) para manejar conjuntos de datos de tamaño variable.

* **Manejo de Objetos:** Aprendizaje sobre cómo los objetos pueden interactuar entre sí y cómo se pueden almacenar referencias de objetos dentro de otras listas.

* **Comportamiento Dinámico:** Los objetos no solo guardan datos, sino que pueden "responder" preguntas (como su promedio) basándose en su estado actual.

## 6. Herencia de vehiculos

Este ejercicio implementa un ecosistema de transporte utilizando una jerarquía de clases. El objetivo es demostrar cómo se pueden compartir atributos y comportamientos comunes mientras se mantiene la capacidad de especializar funciones para tipos específicos de vehículos (autos, motos y eléctricos).

### Estructura y Componentes
### 1. interface ```Arrancable```

* **Descripción:** Define un contrato de comportamiento.

* **Función:** Obliga a cualquier clase que la implemente a definir los métodos ```arrancar()``` y ```detener()```, garantizando que todos los vehículos tengan estas capacidades básicas.

### 2. ```abstract class Vehiculo```

* **Descripción:** La clase base (padre) que implementa ```Arrancable```.

* **Función:** Almacena los atributos comunes (```marca```, ```modelo```, ```anio```) y define el método abstracto ```tipoVehiculo()```. Al ser abstracta, no se pueden crear objetos "Vehículo" genéricos; solo se pueden instanciar sus derivados.

### 3. Clases Especializadas (```Auto``` y ```Moto```)

* **Descripción:** Clases que heredan de Vehiculo (Hijas).

* **Función:** Utilizan ```super()``` para inicializar los datos en la clase padre.

  * Implementan sus propios detalles (ej. numPuertas para autos y cilindrada para motos).

  * Sobrescriben (```@Override```) los métodos de arranque para mostrar mensajes personalizados según su naturaleza (ruido de motor vs. rugido de cilindrada).

### 4. ```class VehiculoElectrico```

* **Descripción:** Un ejemplo de herencia multinivel, ya que extiende de Auto.

* **Función:** Reutiliza la lógica de los autos pero especializa el método ```arrancar()``` para mencionar el silencio del motor y la autonomía en kilómetros.

### 5. ```HerenciaVehiculos (Main)```

* **Descripción:** Clase principal que gestiona una ```List<Vehiculo>```.

* **Función:** 

  * **Polimorfismo:** Almacena diferentes tipos de objetos (Autos, Motos, Eléctricos) en una sola lista de tipo Vehiculo.

  * **Instrospección con instanceof:** Utiliza este operador para identificar el tipo específico de cada objeto en tiempo de ejecución y generar un resumen estadístico de la flota.

### Conceptos Clave Aprendidos

* **Herencia (extends):** Reutilización de código permitiendo que las clases hijas hereden atributos y métodos del padre.

* **Interfaces (implements):** Definición de "qué" debe hacer un objeto sin decir "cómo", permitiendo desacoplar el diseño.

* **Polimorfismo:** La capacidad de tratar a objetos de diferentes clases de manera uniforme (todos son "Vehículos"), pero dejando que cada uno responda a su manera al método ```arrancar()```.

* **Abstracción:** Uso de clases y métodos abstractos para definir plantillas que deben ser completadas por las subclases.

* **Uso de super:** Comunicación esencial entre clases hijas y padres para el manejo de constructores.

##Conclusiones: Semana 1 - Fundamentos de Java

Tras completar estos seis ejercicios prácticos, se han consolidado los pilares fundamentales para el desarrollo de software robusto con Java. Este proceso de aprendizaje ha evolucionado desde la sintaxis básica hasta el diseño de arquitecturas orientadas a objetos.

### Logros Técnicos
* **Dominio de Sintaxis y Tipado:** Se comprendió el manejo de variables, operadores y el uso eficiente de la memoria a través de tipos de datos primitivos y envolventes.

* **Lógica de Control Avanzada:** Implementación de algoritmos para el procesamiento de datos, búsqueda de valores óptimos (mayor/menor) y filtrado de colecciones.

* **Manejo de Cadenas (```Strings```):** Diferenciación crítica entre la inmutabilidad de ```String``` y la eficiencia de ```StringBuilder``` para manipulaciones complejas y patrones visuales.

* **Abstracción y Encapsulamiento:** Capacidad para modelar entidades del mundo real (como ```Estudiante``` o ```Vehiculo```), protegiendo la integridad de los datos mediante modificadores de acceso.

* **Polimorfismo y Herencia:** Implementación de jerarquías de clases y contratos mediante interfaces, permitiendo crear código escalable, mantenible y fácil de extender.

Realizado por **Víctor Manuel Martínez Guerrero**