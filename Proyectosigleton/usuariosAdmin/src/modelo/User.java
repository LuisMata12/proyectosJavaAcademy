package modelo;

public class User {
    private String nombre;
    private String email;

    public User (String nombre, String email){
        this.email=email;
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", "+"Email: "+email;
    }
}
