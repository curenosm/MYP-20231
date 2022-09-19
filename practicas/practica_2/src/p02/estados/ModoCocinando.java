package p02.estados;

import p02.modelos.Platillo;
import p02.modelos.Robot;
import p02.util.Constantes;
import static p02.util.Printer.*;

/**
 * Clase que simula el comportamiento del robot estando en modo cocinando
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ModoCocinando implements EstadoRobot {

    Robot robot;

    /**
     * Metodo consructor con parametros de la clase
     * @param robot Instancia de la clase robot
     */
    public ModoCocinando(Robot robot){
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
     * Metodo que imprime en pantalla un mensaje de error al intentar que l robot atienda
     */
    @Override
    public void atender() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    /**
     * Metodo que imprime mensajes sobre cocinar y tras los intentos adecuados prepara el platillo
     * tras preparar el platillo cambia su estado actual a modo entregar comida
     */
    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
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
     * Metodo que imprime en pantalla un mensaje de error al intentar hacer que el robot entregue comida en este estado
     */
    @Override
    public void entregarComida() {
        success("PASANDO A " + robot.getModoEntregarComida());
        success(Constantes.properties.getProperty("modo.cocinando.label.entregarComida"));
        robot.setEstadoActual(robot.getModoEntregarComida());
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar encender al robot
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
        return Constantes.properties.getProperty("modo.cocinando");
    }
    
}
