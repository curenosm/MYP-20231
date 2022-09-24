public class Catsup extends BaguetteDecorador{

    public Catsup(Baguette pan){
        super(pan);
    }

    public String getDescripcion(){
        return pan.getDescripcion() + ",catsup";
    }

    public double getPrecio(){
        return pan.getPrecio()+3;
    }
}