package p02.estados;

import p02.modelos.Robot;

public class ModoApagado implements EstadoRobot {

    Robot robot;
    public ModoApagado(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        System.out.println("Estoy apagado");
        
    }

    @Override
    public void atender() {
        System.out.println("Estoy apagado");
        
    }

    @Override
    public void cocinar() {
        System.out.println("Estoy apagado");
        
    }

    @Override
    public void apagar() {
        System.out.println("Estoy apagado");
        
    }

    @Override
    public void caminar() {
        System.out.println("Estoy apagado");
        
    }

    @Override
    public void entregarComida() {
        System.out.println("Estoy apagado");
        
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo...");
        System.out.println("Pasando a estado de suspencion");
        robot.asignarEstado(robot.getModoSuspendido());
        
    }
    
}
