package p02.modelos;

import java.util.Collection;

import p02.estados.EstadoRobot;

public class Robot {

    private EstadoRobot estadoActual;
    private Collection<Platillo> ordenActual;
    private Boolean ordenCompleta;

    void asignarEstado(EstadoRobot estado) {
        this.estadoActual = estado;
    }

    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoRobot estadoActual) {
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

    
}
