# PRÁCTICA 03 - Modelado y Programación

# Equipo "Better Code Saul"

# Integrantes 

| **Nombre**  | **No. de cuenta**  |
|---|---|
|  *Álcantara Estrada Kevin Isaac* |  319073799 |
|  *Cureño Sánchez Misael* |  418002485 |
|  *Hernández Páramo Elizabeth* |  319143209 |

<br>

# Instrucciones de compilacion

## Instrucciones para dar formato estandarizado

1. Dirigirse al directorio `src` de la práctica.
2. Ejecutar `java -jar ../lib/google-java-format-1.15.0-all-deps.jar ./main/java/p03/Main.java`

## Forma 1

1. Dirigirse al directorio `src` de la práctica.
2. Compilar usando `javac -sourcepath . -d ../target/ -cp .:../lib/* ./p02/Main.java`
3. Dirigirse al directorio generado `cd ../target`.
4. Ejecutar usando `java -cp .:../lib/* p02.Main`.

## Forma 2 (Linux)
1. Ejecuta el script haciendo `./run.sh` o bien `bash run.sh` desde la terminal, dentro de la carpeta raiz de la práctica (en caso de no tener permiso de ejecución ejecutar `chmod +x run.sh`).

<br/>



<br/>

# SECCIÓN TEÓRICA

*Menciona los principios de diseño esenciales de los patrones Decorator y Adapter. Menciona una desventaja de cada patrón*

<br/>

## DECORATOR
<br/>
Como vimos en clase, este aptrón permite añadir funcionalidad a un objeto existente sin alterar su estructura. Los decoradores actúan como envolturas para los objetos de la clase original.
Las envolturas proveen de funcionalidad adicional manteniendo su funcionalidad original intacta.

### ESTRUCTURA
<br/>

- **Componente:** Declara la interfaz común tanto para wrappers como para objetos envueltos.
- **Componente concreto:** Es una clase de objetos envueltos. Define el comportamiento básico, que los decoradores pueden alterar.
- **La clase Decoradora base:** Tiene un campo para referenciar un objeto envuelto. El tipo del campo debe declararse como la interfaz del componente para que pueda contener tanto los componentes concretos como los decoradores.
- **Decoradores concretos:** Definen funcionalidades adicionales que se pueden añadir dinámicamente a los componentes.
- **Cliente:** Puede envolver componentes en varias capas de decoradores, siempre y cuando trabajen con todos los objetos a través de la interfaz del componente.
<br/><br/>

### IMPLEMENTACIÓN
<br/>

1. Nos aseguramos de que tu dominio de negocio puede representarse como un componente primario con varias capas opcionales encima.
2. Decidimos ué métodos son comunes al componente primario y las capas opcionales. Creamos una interfaz de componente y declara esos métodos en ella.
3. Creamos una clase concreta de componente y define en ella el comportamiento base.
4. Creamos una clase base decoradora. Debe tener un campo para almacenar una referencia a un objeto envuelto. El campo debe declararse con el tipo de interfaz de componente para permitir la vinculación a componentes concretos, así como a decoradores.
5. Aseguramos de que todas las clases implementan la interfaz de componente.
6. Creamos decoradores concretos extendiéndolos a partir de la decoradora base. Un decorador concreto debe ejecutar su comportamiento antes o después de la llamada al método padre (que siempre delega al objeto envuelto).
7. El código cliente debe ser responsable de crear decoradores y componerlos del modo que el cliente necesite.

<br/>

### DESVENTAJA
<br/>

- Es difícil implementar un decorador de tal forma que su comportamiento no dependa del orden en la pila de decoradores.
- El código de configuración inicial de las capas pueden tener un aspecto desagradable.

<br/>

---
<br/>

## ADAPTER
<br/>


### ESTRUCTURA
<br/>


### IMPLEMENTACIÓN
<br/>


### DESVENTAJA
<br/>

<br/>

# Diagramas

<br/>
