package main;

import modelo.User;
import singleton.UserManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstancia();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Eliminar Usuario");
            System.out.println("3. Mostrar Usuarios");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email del usuario: ");
                    String email = scanner.nextLine();
                    User usuario = new User(nombre, email);
                    userManager.agregarUsuario(usuario);
                    System.out.println("Usuario agregado con éxito.");
                    break;

                case 2:
                    System.out.print("Email del usuario a eliminar: ");
                    String emailEliminar = scanner.nextLine();
                    userManager.eliminarUsuario(emailEliminar);
                    System.out.println("Usuario eliminado con éxito.");
                    break;

                case 3:
                    System.out.println("Usuarios en el sistema:");
                    for (User user : userManager.obtenerUsuarios()) {
                        System.out.println(user);
                    }
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}