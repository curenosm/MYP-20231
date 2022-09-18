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
    private int contador = 0;

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
        error(Constantes.properties.getProperty("modo.cocinando.label.suspender"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar que l robot atienda
     */
    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.cocinando.label.suspender"));
    }

    /**
     * Metodo que imprime mensajes sobre cocinar y tras los intentos adecuados prepara el platillo
     * tras preparar el platillo cambia su estado actual a modo entregar comida
     */
    @Override
    public void cocinar() {
        if (contador++ < 3) {
            success(Constantes.properties.getProperty("modo.cocinando.label.cocinar"));
        }
        else {
            error(Constantes.properties.getProperty("modo.cocinando.label.cocinar.completo"));
            robot.getPlatillo().preparar();
            robot.setEstadoActual(robot.getModoEntregarComida());
            contador = 0;
        }
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar apagar al robot
     */
    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.cocinando.label.apagar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar hacer caminar al robot
     */
    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.cocinando.label.caminar"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar hacer que el robot entregue comida en este estado
     */
    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.cocinando.label.entregarComida"));
    }

    /**
     * Metodo que imprime en pantalla un mensaje de error al intentar encender al robot
     */
    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("modo.cocinando.label.encender"));
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
