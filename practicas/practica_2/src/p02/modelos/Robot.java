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

/**
 * Metodo que simula a un robot con sus debidos estados
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
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

    /**
     * Metodo constructor sin parametros de la clase
     */
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
    
    /**
     * Metodo para modificar el valor del atributo platillo
     * @param platillo Instancia de la clase Platillo
     */
    public void setPlatillo(Platillo platillo){
        this.platillo=platillo;
    }

    /**
     * Metodo para obtener el platillo que tiene el robot
     * @return Platillo
     */
    public Platillo getPlatillo(){
        return this.platillo;
    }

    /**
     * Metodo para conocer el estado actual del robot, representado por un modo
     * @return EstadoRobot
     */
    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    /**
     * Metodo que regresa el modo apagado del robot
     * @return EstadoRobot
     */
    public EstadoRobot getModoApagado(){
        return this.modoApagado;
    }

    /**
     * Metodo que regresa el modo suspendido del robot
     * @return EstadoRobot
     */
    public EstadoRobot getModoSuspendido(){
        return this.modoSuspendido;
    }

    /**
     * Metodo que regresa el modo cocinando del robot
     * @return EstadoRobot
     */
    public EstadoRobot getModoCocinando(){
        return this.modoCocinando;
    }

    /**
     * Metodo que regresa el modo caminando del robot
     * @return EstadoRobot
     */
    public EstadoRobot getModoCaminando(){
        return this.modoCaminando;
    }

    /**
     * Metodo que regresa el modo atendiendo del robot
     * @return EstadoRobot
     */
    public EstadoRobot getModoAtendiendo(){
        return this.modoAtendiendo;
    }

    /**
     * Metodo que regresa el modo entregar comida del robot
     * @return EstadoRobot
     */
    public EstadoRobot getModoEntregarComida(){
        return this.modoEntregarComida;
    }

    /**
     * Metodo para modificar el estado del robot
     * @param estadoActual Instancia de la clase EstadoRobot que sera el nuevo estado
     */
    public void setEstadoActual(EstadoRobot estadoActual) {
        success("PASANDO A " + estadoActual);
        this.estadoActual = estadoActual;
    }

    /**
     * Metodo para obtener la orden actual
     * @return Collection<Platillo>
     */
    public Collection<Platillo> getOrdenActual() {
        return ordenActual;
    }

    /**
     * Metodo para modificar la orden actual
     * @param ordenActual Coleccion de instancias de la clase Platillo
     */
    public void setOrdenActual(Collection<Platillo> ordenActual) {
        this.ordenActual = ordenActual;
    }

    /**
     * Metodo para saber si la orden esta completa
     * @return Boolean
     */
    public Boolean getOrdenCompleta() {
        return ordenCompleta;
    }

    /**
     * Metodo para modificar el valor del atributo ordenCompleta
     * @param ordenCompleta Booleano que sera el nuevo valor del atributo
     */
    public void setOrdenCompleta(Boolean ordenCompleta) {
        this.ordenCompleta = ordenCompleta;
    }

    /**
     * Metodo que regresa la carta actual del robot
     * @return Carta
     */
    public Carta getCarta() {
        return carta;
    }

}
