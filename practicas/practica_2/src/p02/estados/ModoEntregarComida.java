package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;
import static p02.util.Printer.*;

/**
 * Clase que simula el comportamiento del robot estando en modo de entregar comida
 * @author Alcantara Estrada Kevin
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ModoEntregarComida implements EstadoRobot {
    
    Robot robot;

    /**
     * Metodo constructor con parametros de la clase
     * @param robot Instancia de la clase robot
     */
    public ModoEntregarComida(Robot robot){
        this.robot=robot;
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta suspender el robot en este estado
     */
    @Override
    public void suspender() {
        success("PASANDO A " + robot.getModoSuspendido());
        success(Constantes.properties.getProperty("modo.entregarComida.label.suspender"));
        robot.setEstadoActual(robot.getModoSuspendido());
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta que el robot atienda en este estado
     */
    @Override
    public void atender() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta que el robot cocine en este estado
     */
    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta apagar el robot en este estado
     */
    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta hacer caminar a el robot en este estado
     */
    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje exitoso si se solicita que el robot entregue comida en este estado
     * el metodo ademas modifica el estado actual del robot a estado suspendido, pues ya ha entregado la comida
     */
    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta encender el robot en este estado
     */
    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("mensajes.accion.encendido"));
    }
    
    /**
     * Representacion en cadena de la clase
     * @return String
     */
    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.entregarComida");
    }
}
