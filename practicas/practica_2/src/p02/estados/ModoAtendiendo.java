package p02.estados;

import p02.modelos.Robot;

public class ModoAtendiendo implements EstadoRobot {

    Robot robot;

    public ModoAtendiendo(Robot robot){
         this.robot=robot;
    }

    @Override
    public void suspender() {
        System.out.println("Actualmente no me puedo suspender");
        
    }

    @Override
    public void atender() {
        //METODO PARA ATENDER, DEBERIA MOSTRAR LA CARTA Y RECIBIR UNA ORDEN
        
    }

    @Override
    public void cocinar() {
        System.out.println("Actualmente no puedo cocinar");
        
    }

    @Override
    public void apagar() {
        System.out.println("No me es posible apagarme");
        
    }

    @Override
    public void caminar() {
        System.out.println("No caminare mas por ahora");
        
    }

    @Override
    public void entregarComida() {
        System.out.println("No tengo comida para entregarte");
        
    }

    @Override
    public void encender() {
        System.out.println("Actualmente ya estoy encendido");
        
    }
    
}
