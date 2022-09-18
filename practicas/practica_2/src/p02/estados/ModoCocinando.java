package p02.estados;

import p02.modelos.Platillo;
import p02.modelos.Robot;
import p02.util.Constantes;
import static p02.util.Printer.*;

public class ModoCocinando implements EstadoRobot {

    Robot robot;
    private int contador = 0;

    public ModoCocinando(Robot robot){
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
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("mensajes.accion.prohibida"));
    }

    @Override
    public void entregarComida() {
        success("PASANDO A " + robot.getModoEntregarComida());
        success(Constantes.properties.getProperty("modo.cocinando.label.entregarComida"));
        robot.setEstadoActual(robot.getModoEntregarComida());
    }

    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("mensajes.accion.encendido"));
    }

    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.cocinando");
    }
    
}
