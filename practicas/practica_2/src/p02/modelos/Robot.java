package p02.modelos;

import java.util.Collection;

import p02.estados.EstadoRobot;
import p02.estados.ModoApagado;
import p02.estados.ModoAtendiendo;
import p02.estados.ModoCaminando;
import p02.estados.ModoCocinando;
import p02.estados.ModoEntregarComida;
import p02.estados.ModoSuspendido;

import static p02.util.Printer.*;

public class Robot {

    private EstadoRobot estadoActual;
    private Collection<Platillo> ordenActual;
    private Platillo platillo;
    private Boolean ordenCompleta;
    private ModoApagado modoApagado;
    private ModoSuspendido modoSuspendido;
    private ModoAtendiendo modoAtendiendo;
    private ModoCaminando modoCaminando;
    private ModoCocinando modoCocinando;
    private ModoEntregarComida modoEntregarComida;

    private Carta carta;

    public Robot(){
        this.estadoActual= new ModoApagado(this);
        this.modoApagado = new ModoApagado(this);
        this.modoSuspendido = new ModoSuspendido(this);
        this.modoAtendiendo = new ModoAtendiendo(this);
        this.modoCaminando = new ModoCaminando(this);
        this.modoCocinando = new ModoCocinando(this);
        this.modoEntregarComida = new ModoEntregarComida(this);
        this.carta = new Carta();
        setEstadoActual(modoApagado);
    }
    
    public void setPlatillo(Platillo platillo){
        this.platillo=platillo;
    }

    public Platillo getPlatillo(){
        return this.platillo;
    }

    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    public EstadoRobot getModoApagado(){
        return this.modoApagado;
    }


    public EstadoRobot getModoSuspendido(){
        return this.modoSuspendido;
    }


    public EstadoRobot getModoCocinando(){
        return this.modoCocinando;
    }


    public EstadoRobot getModoCaminando(){
        return this.modoCaminando;
    }

    
    public EstadoRobot getModoAtendiendo(){
        return this.modoAtendiendo;
    }


    public EstadoRobot getModoEntregarComida(){
        return this.modoEntregarComida;
    }

    public void setEstadoActual(EstadoRobot estadoActual) {
        success("PASANDO A " + estadoActual);
        this.estadoActual = estadoActual;
    }

    public Collection<Platillo> getOrdenActual() {
        return ordenActual;
    }

    public void setOrdenActual(Collection<Platillo> ordenActual) {
        this.ordenActual = ordenActual;
    }

    public Boolean getOrdenCompleta() {
        return ordenCompleta;
    }

    public void setOrdenCompleta(Boolean ordenCompleta) {
        this.ordenCompleta = ordenCompleta;
    }

    public Carta getCarta() {
        return carta;
    }

}
