package p02.estados;

import p02.modelos.Robot;
import p02.util.Constantes;

import static p02.util.Printer.*;

public class ModoAtendiendo implements EstadoRobot {

    Robot robot;

    public ModoAtendiendo(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        error(Constantes.properties.getProperty("modo.atendiendo.label.suspender"));
    }

    @Override
    public void atender() {
        //METODO PARA ATENDER, DEBERIA MOSTRAR LA CARTA Y RECIBIR UNA ORDEN
        error(Constantes.properties.getProperty("modo.atendiendo.label.atender.error"));
        success(Constantes.properties.getProperty("modo.atendiendo.label.atender.success"));
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
