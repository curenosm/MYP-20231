package p02.estados;

/**
 * Interfaz que simula modela los comportamientos a realizar segun el estado actual del robot
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface EstadoRobot {
    void suspender();
    void atender();
    void cocinar();
    void apagar();
    void caminar();
    void entregarComida();
    void encender();
}
