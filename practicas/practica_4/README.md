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

## Forma 1

1. Dirigirse al directorio `src` de la práctica
2. Compilar usando <br/>

`javac -sourcepath . -d ../target/ -cp .:../lib/* ./main/java/p04/Main.java`

3. Copiar los recursos usando `cp -r ./main/resources ../target/main/`
4. Dirigirse al directorio generado `cd ../target`
5. Ejecutar usando `java -cp .:../lib/* main.java.p04.Main`

## Forma 2 (Linux)
1. Ejecuta el script haciendo `./run.sh` o bien `bash run.sh` desde la terminal, dentro de la carpeta raiz de la práctica (en caso de no tener permiso de ejecución ejecutar `chmod +x run.sh`).

<br/>

# Instrucciones de formato estandarizado
1. En la raíz de la práctica ejecutar `make`.
2. En caso de que solo se quiera saber los errores de formato ejecutar `make check-format`.
3. En caso de que se quieran corregir los errores de formato ejecutar `make reformat`.

<br/>
<br/>
<br/><br/><br/>

# SECCIÓN TEÓRICA

*Menciona los principios de diseño esenciales de los patrones Factory, Abstract Factory y Builder. Menciona una desventaja de cada patrón*

<br/>

## FACTORY
<br/>
Como se nos explicó en clase, el método Factory define una interfaz para crear un objeto permitiendo que las subclases decidan qué clase instanciar. El método factory permite que una clase difiera a la instalación a subclases.

### ESTRUCTURA
<br/>

- **Producto:** Declara la interfaz, que es común a todos los objetos que puede producir la clase creadora y sus subclases.
- **Productos concretos:** Son distintas implementaciones de la interfaz de producto.
- **Clase creadora:** Declara el método fábrica que devuelve nuevos objetos de producto.Es importante que el tipo de retorno de este método coincida con la interfaz de producto.
- **Los creadores concretos:** Sobrescriben el método factory base, de modo que devuelva un tipo diferente de producto.
<br/><br/>


### IMPLEMENTACIÓN
<br/>

1. Hacemos que todos los productos sigan la misma interfaz. Esta interfaz deberá declarar métodos que tengan sentido en todos los productos.
2. Añadimos un patrón Factory Method vacío dentro de la clase creadora. El tipo de retorno del método deberá coincidir con la interfaz común de los productos.
3. Encontramos todas las referencias a constructores de producto en el código de la clase creadora.
4. Creamos un grupo de subclases creadoras para cada tipo de producto enumerado en el método Factory.
5. Si hay demasiados tipos de producto y no tiene sentido crear subclases para todos ellos, podemos reutilizar el parámetro de control de clase base en las subclases.
6. Si, tras todas las extracciones el método factory base queda vacío, podemos hacerlo abstracto. Si queda algo dentro, podemos convertirlo en un comportamiento por defecto del método.

<br/>

### DESVENTAJA
<br/>

- Puede que el código se complique, ya que debemos incorporar una multitud de nuevas subclases para implementar el patrón.

<br/>

---
<br/>

## ABSTRACT FACTORY
<br/>
El método Abstract factory proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.

### ESTRUCTURA
<br/>

- **Productos abstractos:** Declaran interfaces para un grupo de productos diferentes pero relacionados que forman una familia de productos.
- **Productos concretos:** Son implementaciones distintas de productos abstractos agrupados por variantes. Cada producto abstracto debe implementarse en todas las variantes dadas.
- **Interfaz Abstract factory:** Declara un grupo de métodos para crear cada uno de los productos abstractos.
- **Fábricas concretas:** Implementan métodos de creación de la fábrica abstracta. Cada fábrica concreta se corresponde con una variante específica de los productos y crea tan solo dichas variantes de los productos.
<br/><br/>


### IMPLEMENTACIÓN
<br/>

1. Mapeamos una matriz de distintos tipos de productos frente a variantes de dichos productos.
2. Declaramos interfaces abstractas de producto para todos los tipos de productos. Después hacemos que todas las clases concretas de productos implementen esas interfaces.
3. Declaramos la interfaz de la fábrica abstracta con un grupo de métodos de creación para todos los productos abstractos.
4. Implementamos un grupo de clases concretas de fábrica, una por cada variante de producto.
5. Creamos un código de inicialización de la fábrica en algún punto de la aplicación.
6. Exploramos el código y encontramos todas las llamadas directas a constructores de producto. Las sustituimos por llamadas al método de creación adecuado dentro del objeto de fábrica.

<br/>

### DESVENTAJA
<br/>

- El código puede que se complique más de lo que debería, ya que se introducen muchas nuevas interfaces y clases junto al patrón.

<br/>

---
<br/>

## BUILDER
<br/>

### ESTRUCTURA
<br/>


### IMPLEMENTACIÓN

br/>

### DESVENTAJA
<br/>

-
-

<br/>

# Diagramas

<br/>

<center>
    <img src="./DiagramaClases.png" width="100%">
</center>
