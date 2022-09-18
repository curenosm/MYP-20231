package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

public class ModoApagado implements EstadoRobot {

    Robot robot;

    public ModoApagado(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("modo.apagado.label.suspender"));
    }

    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.apagado.label.atender"));
    }

    @Override
    public void cocinar() {
        error(Constantes.properties.getProperty("modo.apagado.label.cocinar"));
    }

    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.apagado.label.apagar"));
    }

    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.apagado.label.caminar"));
    }

    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.apagado.label.entregarComida"));
    }

    @Override
    public void encender() {
        success(Constantes.properties.getProperty("modo.apagado.label.encender"));
        robot.setEstadoActual(robot.getModoSuspendido());
    }

    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.apagado");
    }
}
