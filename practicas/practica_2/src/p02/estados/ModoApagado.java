package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

/**
 * Clase que simula el comportamiento del robot al estar en modo apagado
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class ModoApagado implements EstadoRobot {

    Robot robot;

   /**
    * Metodo constructor con parametros de la clase
    * @param robot Instancia de la clase robot
    */
    public ModoApagado(Robot robot){
        this.robot=robot;
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar suspender al robot
     */
    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("modo.apagado.label.suspender"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al querer que el robot atienda
     */
    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.apagado.label.atender"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al querer que el robot cocine
     */
    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.apagado.label.cocinar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al querer que el robot se apague
     */
    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.apagado.label.apagar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al querer que el robot camine
     */
    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.apagado.label.caminar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al querer que el robot camine
     */
    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.apagado.label.entregarComida"));
    }

    /**
     * Metodo que muestra un mensaje de exito al querer encender al robot y lo hace pasar a estados suspendido
     */
    @Override
    public void encender() {
        success(Constantes.properties.getProperty("modo.apagado.label.encender"));
        robot.setEstadoActual(robot.getModoSuspendido());
    }

    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.apagado");
    }
}
