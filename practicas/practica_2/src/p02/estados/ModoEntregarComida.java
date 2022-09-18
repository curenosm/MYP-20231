package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;
import static p02.util.Printer.*;

public class ModoEntregarComida implements EstadoRobot {
    
    Robot robot;

    public ModoEntregarComida(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("modo.entregarComida.label.suspender"));
    }

    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.entregarComida.label.atender"));
    }

    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.entregarComida.label.cocinar"));
    }

    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.entregarComida.label.apagar"));
    }

    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.entregarComida.label.caminar"));
    }

    @Override
    public void entregarComida() {
        success(Constantes.properties.getProperty("modo.entregarComida.label.entregarComida"));
        robot.setEstadoActual(robot.getModoSuspendido()); 
    }

    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("modo.entregarComida.label.suspender"));
    }
    
    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.entregarComida");
    }
}
