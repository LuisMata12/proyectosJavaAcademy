package tipovehiculos;

public abstract class VehiculoBase implements Vehiculos{
    protected String marca;
    protected String modelo;

    public VehiculoBase(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+modelo);
    }
}
