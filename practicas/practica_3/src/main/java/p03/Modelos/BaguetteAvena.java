
public class BaguetteAvena extends Baguette{

    public BaguetteAvena(){
        this.descripcion="Baguette con pan de avena";
        this.precio= 50;
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion() + this.descripcion;
    }

    @Override
    public double getPrecio(){
        return super.precio + this.precio;
    }
}