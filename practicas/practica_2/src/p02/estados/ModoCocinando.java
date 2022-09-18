package p02.estados;

import p02.modelos.Platillo;
import p02.modelos.Robot;
import p02.util.Constantes;
import static p02.util.Printer.*;

public class ModoCocinando implements EstadoRobot {

    Robot robot;
    public ModoCocinando(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("modo.cocinando.label.suspender"));
    }

    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.cocinando.label.suspender"));
    }

    @Override
    public void cocinar() {
        success(Constantes.properties.getProperty("modo.cocinando.label.cocinar"));
        robot.getPlatillo().preparar();
        robot.asignarEstado(robot.getModoEntregarComida());
    }

    @Override
    public void apagar() {
        error(Constantes.properties.getProperty("modo.cocinando.label.apagar"));
    }

    @Override
    public void caminar() {
        error(Constantes.properties.getProperty("modo.cocinando.label.caminar"));
    }

    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.cocinando.label.entregarComida"));
    }

    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("modo.cocinando.label.encender"));
    }

    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.cocinando");
    }
    
}
