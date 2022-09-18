package p02.estados;

import p02.modelos.Robot;

public class ModoEntregarComida implements EstadoRobot {
    Robot robot;

   
    public ModoEntregarComida(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        System.out.println("No me puedo suspender");
        
    }

    @Override
    public void atender() {
        System.out.println("Ya te estoy atendiendo");
        
    }

    @Override
    public void cocinar() {
        System.out.println("Actualmente ya he cocicnado todo");
        
    }

    @Override
    public void apagar() {
        System.out.println("Para apagarme debo estar suspendido");
        
    }

    @Override
    public void caminar() {
        System.out.println("No se me permite caminar en estos momentos");
        
    }

    @Override
    public void entregarComida() {
        System.out.println("Espero disfrute su comida");
        System.out.println("Entrando en modo suspendido");
         robot.asignarEstado(robot.getModoSuspendido()); 

        
    }

    @Override
    public void encender() {
        System.out.println("Ya estoy encendido");
        
    }
    
}
