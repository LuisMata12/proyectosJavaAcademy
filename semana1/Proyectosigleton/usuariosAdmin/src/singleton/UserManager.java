package singleton;

import modelo.User;

import java.util.List;
import java.util.ArrayList;
public class UserManager {
    private static UserManager instanciaUnica;
    private List<User> usuarios;


    private UserManager() {
        usuarios = new ArrayList<>();
    }


    public static synchronized UserManager getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new UserManager();
        }
        return instanciaUnica;
    }


    public void agregarUsuario(User usuario) {
        usuarios.add(usuario);
    }


    public void eliminarUsuario(String email) {
        usuarios.removeIf(usuario -> usuario.getEmail().equals(email));
    }


    public List<User> obtenerUsuarios() {
        return usuarios;
    }
}