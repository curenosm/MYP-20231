public class Jitomate extends BaguetteDecorador{

    public Jitomate(Baguette pan){
        super(pan);
    }

    public String getDescripcion(){
        return pan.getDescripcion() + ",jitomate";
    }

    public double getPrecio(){
        return pan.getPrecio()+2.5;
    }
}