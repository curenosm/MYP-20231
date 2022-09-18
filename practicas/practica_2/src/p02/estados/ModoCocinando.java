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
        error(Constantes.properties.getProperty("modo.cocinando.label.suspender"));
    }

    @Override
    public void atender() {
        error(Constantes.properties.getProperty("modo.cocinando.label.suspender"));
    }

    @Override
    public void cocinar() {
        if (contador++ <= 3) {
            success(Constantes.properties.getProperty("modo.cocinando.label.cocinar.error"));
        }
        else {
            error(Constantes.properties.getProperty("modo.cocinando.label.cocinar.success"));
            robot.getPlatillo().preparar();
            robot.setEstadoActual(robot.getModoEntregarComida());
            contador = 0;
            return;
        }

        contador++;
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

        error(Constantes.properties.getProperty("modo.cocinando.label.cocinando"));

        if (contador == 0) {
            success(this.robot.getCarta().toString());
            
        } else if (contador == 3) {
            entregarComida();
        }
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
