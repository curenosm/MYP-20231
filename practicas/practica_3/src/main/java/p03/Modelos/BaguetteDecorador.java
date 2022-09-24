public abstract class BaguetteDecorador extends Baguette{

    protected Baguette pan;

    public BaguetteDecorador(Baguette pan){
        this.pan = pan;
    }

    @Override
    public String getDescripcion(){
        return pan.getDescripcion();
    }

    @Override
    public double getPrecio(){
        return pan.getPrecio();
    }
}