package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

/**
 * Clase que simula el comportamiento del robot estando en modo atendiendo
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class ModoAtendiendo implements EstadoRobot {

    Robot robot;
    private int contador = 0;

    /**
     * Metodo constructor con parametros de la clase
     * @param robot Instancia de la clase robot
     */
    public ModoAtendiendo(Robot robot){
        this.robot=robot;
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar suspender al robot
     */
    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que permite que el usuario solicite la comida deseada y el robot guarde la orden
     * al completar la orden el robot imprime un mensaje exitoso y cambia su estado actual a modo cocinando
     */
    @Override
    public void atender() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar poner al robot a cocinar
     */
    @Override
    public void cocinar() {
        success("PASANDO A " + robot.getModoCocinando());
        success(Constantes.properties.getProperty("modo.atendiendo.label.cocinar"));
        robot.setEstadoActual(robot.getModoCocinando());
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar apagar al robot
     */
    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar hacer caminar al robot
     */
    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al pedir al robot entregar comida
     */
    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de advertencia al intentar encender al robot
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
        return Constantes.properties.getProperty("modo.atendiendo");
    }
}
