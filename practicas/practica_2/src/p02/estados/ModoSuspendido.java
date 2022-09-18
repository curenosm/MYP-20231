package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;
import static p02.util.Printer.*;

public class ModoSuspendido implements EstadoRobot {

    Robot robot;
    public ModoSuspendido(Robot robot){
        this.robot=robot;
    }
    
    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("modo.suspendido.label.suspender"));
    }

    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.suspendido.label.atender"));
    }

    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.suspendido.label.cocinar"));
    }

    @Override
    public void apagar() {
        version(Constantes.properties.getProperty("mensaje.despedida"));
        System.exit(0);
    }

    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.suspendido.label.caminar"));
    }

    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.suspendido.label.entregarComida"));
    }

    @Override
    public void encender() {
        success(Constantes.properties.getProperty("modo.suspendido.label.encender"));
        this.robot.asignarEstado(robot.getModoCaminando());
    }

    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.suspendido");
    }
    
}
