# PROYECTO 01 - Modelado y Programación

# Equipo "Better Code Saul"

# Integrantes 

| **Nombre**  | **No. de cuenta**  |
|---|---|
|  *Álcantara Estrada Kevin Isaac* |  319073799 |
|  *Cureño Sánchez Misael* |  418002485 |
|  *Hernández Páramo Elizabeth* |  319143209 |

<br>

# Instrucciones de compilacion


## **Linux**

### Forma 1

1. Dirigirse al directorio raiz del proyecto
2. Compilar usando `./mvnw package`
3. Ejecutar usando `java -jar ./target/proyecto_1-0.0.1-executable.jar <param>` donde param puede ser o bien server o bien client.

### Forma 2
1. Dirigirse al directorio raiz del proyecto
2. Ejecuta el script haciendo `./run.sh <param>` desde la terminal donde *param* puede ser o bien server o bien client (en caso de no tener permiso de ejecución ejecutar `chmod +x run.sh`).


<br/>

## **Windows**

### Forma 1

1. Dirigirse al directorio raiz del proyecto
2. Compilar usando `.\mvnw.cmd package`
3. Ejecutar usando `java -jar .\target\proyecto_1-0.0.1-executable.jar`

<br/><br/>

# Notas 
- Los diagramas se encuentran ubicados en la carpeta `docs`
- Existen 3 usuarios predeterminados en el sistema, cuyos datos de inicio de sesion son:

    ### Mexico

    **username:** admin <br/>
    **password:** admin

    <br/>

    ### USA

    **username:** john <br/>
    **password:** john

    <br/>

    ### España

    **username:** manolo <br/>
    **password:** manolo

<br/>
<br/>

# Requerimientos

- Guardar informacion usuarios.
- Generar identificador unico de usuarios.
- Crear Abstract Factory para los mensajes internacionalizados 
(cambiara dependiendo del pais del cliente).
- Lista de productos fija.
- Crear ofertas de manera "aleatoria".
- Personalizar ofertas de manera regional.
- Descuentos fijos establecidos para las ofertas.
- Enviar oferta a usuarios.
- Guardar informacion productos.
- Usar proxy para cargar catalogo de manera remota.
- Dar buen formato a catalogo.
- Iniciar sesion con usuario y contraseña.
- Crear menu usuarios.
- Realizar compra de productos (uno a la vez).
- Mostrar ticket de compra.
- Cerrar sesion.
- Salir del sistema.
- Utilizar representante para compra segura.
- Solicitar numero de cuenta bancaria y compararlo.


# Diagramas

<br/>

<center>
    <img src="./docs/DiagramaClases.png" width="100%">
</center>

<center>
    <img src="./docs/DiagramaSecuencia.png" width="100%">
</center>

