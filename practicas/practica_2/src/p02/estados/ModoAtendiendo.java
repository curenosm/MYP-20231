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
        error(Constantes.properties.getProperty("modo.atendiendo.label.suspender"));
    }

    @Override
    public void atender() {

        if (contador++ < 3) {
            error(Constantes.properties.getProperty("modo.atendiendo.label.atender.error"));
        } else {
            success(Constantes.properties.getProperty("modo.atendiendo.label.atender.success"));
            robot.setEstadoActual(robot.getModoCocinando());
            contador = 0;
        }
    }

    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.atendiendo.label.cocinar"));
    }

    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.atendiendo.label.apagar"));
    }

    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.atendiendo.label.caminar"));
    }

    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.atendiendo.label.entregarComida"));
    }

    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("modo.atendiendo.label.enceder"));
    }
    
    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.atendiendo");
    }
}
