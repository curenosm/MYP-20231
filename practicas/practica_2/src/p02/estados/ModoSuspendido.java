package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;
import static p02.util.Printer.*;

/**
 * Clase que simula el modo suspendido del robot
 * @author Alcantara Estrada Kevin
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo ELizabeth
 */
public class ModoSuspendido implements EstadoRobot {

    Robot robot;
    /**
     * Metodo constructor con parametros de la clase 
     * @param robot Instancia de la clase Robot
     */
    public ModoSuspendido(Robot robot){
        this.robot=robot;
    }
    
    /**
     * Metodo que imprime en pantalla un mensaje si se intenta suspender el robot en este estado
     */
    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("modo.suspendido.label.suspender"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta que el robot atienda en este estado
     */
    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.suspendido.label.atender"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta que el robot cocine en este estado
     */
    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.suspendido.label.cocinar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje y cierra por completo el programa
     */
    @Override
    public void apagar() {
        version(Constantes.properties.getProperty("mensaje.despedida"));
        System.exit(0);
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta que el robot camine en este estado
     */
    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.suspendido.label.caminar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje si se intenta que el robot entregue comida en este estado
     */
    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.suspendido.label.entregarComida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje y cambia el estado actual del robot
     */
    @Override
    public void encender() {
        success(Constantes.properties.getProperty("modo.suspendido.label.encender"));
        robot.setEstadoActual(robot.getModoCaminando());
    }

    /**
     * Representacion en cadena de la clase
     * @return String
     */
    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.suspendido");
    }
    
}
