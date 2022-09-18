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
        success("PASANDO A " + robot.getModoSuspendido());
        success(Constantes.properties.getProperty("modo.entregarComida.label.suspender"));
        robot.setEstadoActual(robot.getModoSuspendido());
    }

    @Override
    public void atender() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("mensajes.accion.encendido"));
    }
    
    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.entregarComida");
    }
}
