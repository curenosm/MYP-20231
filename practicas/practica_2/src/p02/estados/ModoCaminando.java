package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

public class ModoCaminando implements EstadoRobot {
    
    Robot robot;
    private int contador = 0;

    public ModoCaminando(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        success("PASANDO A " + robot.getModoSuspendido());
        success(Constantes.properties.getProperty("modo.caminando.label.suspender"));
        robot.setEstadoActual(robot.getModoSuspendido());
    }

    @Override
    public void atender() {
        success("PASANDO A " + robot.getModoAtendiendo());
        success(Constantes.properties.getProperty("modo.caminando.label.atender"));
        success(this.robot.getCarta().toString());
        robot.setEstadoActual(robot.getModoAtendiendo());
    }

    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.caminando.label.cocinar"));
    }

    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.caminando.label.apagar"));
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
        return Constantes.properties.getProperty("modo.caminando");
    }
}
