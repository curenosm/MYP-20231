package p02.estados;

import p02.modelos.Robot;

public class ModoSuspendido implements EstadoRobot {

    Robot robot;
    public ModoSuspendido(Robot robot){
        this.robot=robot;
    }
    
    @Override
    public void suspender() {
        System.out.println("Ya estoy suspendido.");
        
    }

    @Override
    public void atender() {
        System.out.println("Me es imposible atender estando suspendido");
        
    }

    @Override
    public void cocinar() {
        System.out.println("No puedo cocinar estando suspendido");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando sistema...");
        System.out.println("Apagado, hasta luego");
        System.exit(0);
        
    }

    @Override
    public void caminar() {
        System.out.println("Inadmisible tal accion");
        
    }

    @Override
    public void entregarComida() {
        System.out.println("No me es posible tal accion");
        
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo...");
        System.out.println("Me dirijo hacia su mesa");
        this.robot.asignarEstado(robot.getModoCaminando());
        
    }
    
}
