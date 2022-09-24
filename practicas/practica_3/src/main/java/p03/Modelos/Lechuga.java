public class Lechuga extends BaguetteDecorador{

    public Lechuga(Baguette pan){
        super(pan);
    }

    public String getDescripcion(){
        return pan.getDescripcion() + ",lechuga";
    }

    public double getPrecio(){
        return pan.getPrecio()+3;
    }
}