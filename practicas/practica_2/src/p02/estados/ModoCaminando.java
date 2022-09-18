package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

public class ModoCaminando implements EstadoRobot {
    private int contador=0;

    Robot robot;
    public ModoCaminando(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        success(Constantes.properties.getProperty("modo.caminando.label.suspender"));
        robot.asignarEstado(robot.getModoSuspendido());
    }

    @Override
    public void atender() {
        
        if (contador < 3){
            error(Constantes.properties.getProperty("modo.caminando.label.atender"));
        } else {
            success(Constantes.properties.getProperty("modo.caminando.label.atender"));
            robot.asignarEstado(robot.getModoAtendiendo());
        }
        
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
        success(Constantes.properties.getProperty("modo.caminando.label.caminar"));
    }

    @Override
    public void entregarComida() {
        error(Constantes.properties.getProperty("modo.caminando.label.entregarComida"));
    }

    @Override
    public void encender() {
        warning(Constantes.properties.getProperty("modo.caminando.label.enceder"));
    }
    
    @Override
    public String toString() {
        return Constantes.properties.getProperty("modo.caminando");
    }
}
