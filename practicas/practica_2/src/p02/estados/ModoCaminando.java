package p02.estados;

import p02.modelos.Robot;

public class ModoCaminando implements EstadoRobot {
   private int contador=0;

    Robot robot;
    public ModoCaminando(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        System.out.println("Suspendiendo...");
        System.out.println("Suspendido");
        robot.asignarEstado(robot.getModoSuspendido());
        
    }

    @Override
    public void atender() {
        if(contador<3){
            System.out.println("Aun no llego a tu mesa");
            
        }else{
            System.out.println("Listo para atenderte");
            robot.asignarEstado(robot.getModoAtendiendo());
        }
        
    }

    @Override
    public void cocinar() {
        System.out.println("No es posible cocinar actualmente");
        
    }

    @Override
    public void apagar() {
        System.out.println("Para apagarme debo estar suspendido");
        
    }

    @Override
    public void caminar() {
        if(contador <3){
            System.out.println("Yendo a tu mesa");
            contador++;
        }else{
            System.out.println("No puedo caminar mas, ya he llegado a tu mesa, pero podria atenderte");
        }
        
    }

    @Override
    public void entregarComida() {
        System.out.println("Pero si aun no solicitas tu comida...");
        
    }

    @Override
    public void encender() {
        System.out.println("Actualmente ya estoy encendido");
        
    }
    
}
