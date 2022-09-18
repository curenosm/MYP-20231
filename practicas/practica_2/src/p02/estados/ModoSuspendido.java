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
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
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
        success("PASANDO A " + robot.getModoApagado());
        version(Constantes.properties.getProperty("modo.suspendido.label.apagar"));
        System.exit(0);
    }

    @Override
    public void caminar() {
        success("PASANDO A " + robot.getModoCaminando());
        success(Constantes.properties.getProperty("modo.suspendido.label.caminar"));
        robot.setEstadoActual(robot.getModoCaminando());
    }

    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void encender() {
        error(Constantes.properties.getProperty("mensajes.accion.encendido"));
    }

    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.suspendido");
    }
    
}
