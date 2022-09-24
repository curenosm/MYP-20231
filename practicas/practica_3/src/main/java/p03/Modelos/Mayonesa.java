public class Mayonesa extends BaguetteDecorador{

    public Mayonesa(Baguette pan){
        super(pan);
    }

    public String getDescripcion(){
        return pan.getDescripcion() + ",mayonesa";
    }

    public double getPrecio(){
        return pan.getPrecio()+2;
    }
}