package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

/**
 * Clase que simula el comportamiento del robot estando en modo caminando
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ModoCaminando implements EstadoRobot {
    
    Robot robot;
    private int contador = 0;

    /**
     * Constructor con parametros de la clase
     * @param robot Instancia de la clase robot
     */
    public ModoCaminando(Robot robot){
        this.robot=robot;
    }

    /**
     * Metodo que imprime en pantalla un mensaje exitoso al intentar suspender el robot
     * cambia el estado actual del robot a modo suspendido
     */
    @Override
    public void suspender() {
        success(Constantes.properties.getProperty("modo.caminando.label.suspender"));
        robot.setEstadoActual(robot.getModoSuspendido());
    }

    /**
     * Metodo que tras unos intentos (en donde se imprime un mensaje de error) permite atender al cliente
     * tras los intentos adecuados, se cambia el estado actual del robot a modo atender
     */
    @Override
    public void atender() {
        if (contador < 3){
            error(Constantes.properties.getProperty("modo.caminando.label.atender"));
            contador++;
        } else {
            success(Constantes.properties.getProperty("modo.caminando.label.atender"));
            robot.setEstadoActual(robot.getModoAtendiendo());
            contador = 0;
        }
        
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error si se intenta hacer cocinar al robot en este estado
     */
    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.caminando.label.cocinar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error si se intenta apagar al robot en este estado
     */
    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.caminando.label.apagar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error si se intenta hacer caminar al robot en este estado
     */
    @Override
    public void caminar() {
        success(Constantes.properties.getProperty("modo.caminando.label.caminar"));
        contador++;
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error si se intenta hacer que eñ robot entregue comida en este estado
     */
    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.caminando.label.entregarComida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de advertencia si se intenta encender cocinar al robot en este estado
     */
    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("modo.caminando.label.enceder"));
    }
    
    /**
     * Representacion en cadena de la clase
     * @return String
     */
    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.caminando");
    }
}
