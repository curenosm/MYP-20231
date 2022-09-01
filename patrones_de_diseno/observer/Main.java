package patrones_de_diseno.observer;

public class Main {
    CheemsDistopico liderCheems = new CheemsDistopico();

    CasaCiudadano a101 = new CasaCiudadano();
    CasaCiudadano a202 = new CasaCiudadano();
    CasaCiudadano a303 = new CasaCiudadano();
    CasaCiudadano a404 = new CasaCiudadano();

    liderCheems.setNoticia("Test");
    liderCheems.notificar();

    d404 = new CasaCiudadano("d404");
    liderCheems.setNoticia("La guerra acababo");
    liderCheems.notificar();

}
