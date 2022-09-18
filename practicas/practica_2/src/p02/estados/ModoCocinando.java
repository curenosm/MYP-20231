package p02.estados;

import p02.modelos.Platillo;
import p02.modelos.Robot;

public class ModoCocinando implements EstadoRobot {

    Robot robot;
    public ModoCocinando(Robot robot){
        this.robot=robot;
    }

    @Override
    public void suspender() {
        System.out.println("No me puedo suspender en este momento");
        
    }

    @Override
    public void atender() {
        System.out.println("No puedo atenderte en este momento");
        
    }

    @Override
    public void cocinar() {
        System.out.println("Es hora de preparar tu platillo");
        robot.getPlatillo().preparar();
       robot.asignarEstado(robot.getModoEntregarComida());
    }

    @Override
    public void apagar() {
        System.out.println("Accion no disponible");
        
    }

    @Override
    public void caminar() {
        System.out.println("No puedo caminar mientras cocino, es peligroso");
        
    }

    @Override
    public void entregarComida() {
        System.out.println("Podre entregarte tu comida al terminar de prepararla");
        
    }

    @Override
    public void encender() {
        System.out.println("Actualmente ya estoy encendido");
        
    }
    
}
