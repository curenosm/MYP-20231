package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

public class ModoAtendiendo implements EstadoRobot {

    Robot robot;
    private int contador = 0;

    public ModoAtendiendo(Robot robot){
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
        success("PASANDO A " + robot.getModoCocinando());
        success(Constantes.properties.getProperty("modo.atendiendo.label.cocinar"));
        robot.setEstadoActual(robot.getModoCocinando());
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
        return Constantes.properties.getProperty("modo.atendiendo");
    }
}
