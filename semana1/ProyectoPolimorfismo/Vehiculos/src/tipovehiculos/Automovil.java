package tipovehiculos;

public class Automovil extends VehiculoBase{
    private int numeroDePuertas;

    public Automovil(String marca,String modelo,int numeroDePuertas){
        super(marca,modelo);
        this.numeroDePuertas=numeroDePuertas;
    }

    @Override
    public void acelerar (){
        System.out.println("El automovil esta acelerando");
    }
    @Override
    public void frenar() {
        System.out.println("El automóvil está frenando.");
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
