package tipovehiculos;

public class Bicicleta extends VehiculoBase {
    private boolean tieneCanasta;

    public Bicicleta(String marca, String modelo, boolean tieneCanasta) {
        super(marca, modelo);
        this.tieneCanasta = tieneCanasta;
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta está frenando.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene canasta: " + (tieneCanasta ? "Sí" : "No"));
    }
}
