import tipovehiculos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehiculos> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar Automóvil");
            System.out.println("2. Agregar Bicicleta");
            System.out.println("3. Mostrar Detalles de Todos los Vehículos");
            System.out.println("4. Mostrar Detalles de Automóviles");
            System.out.println("5. Mostrar Detalles de Bicicletas");
            System.out.println("6. Acelerar Vehículos");
            System.out.println("7. Frenar Vehículos");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Marca del automóvil: ");
                    String marcaAuto = scanner.nextLine();
                    System.out.print("Modelo del automóvil: ");
                    String modeloAuto = scanner.nextLine();
                    System.out.print("Número de puertas: ");
                    int puertas = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    vehiculos.add(new Automovil(marcaAuto, modeloAuto, puertas));
                    break;

                case 2:
                    System.out.print("Marca de la bicicleta: ");
                    String marcaBici = scanner.nextLine();
                    System.out.print("Modelo de la bicicleta: ");
                    String modeloBici = scanner.nextLine();
                    System.out.print("¿Tiene canasta? (true/false): ");
                    boolean canasta = scanner.nextBoolean();
                    scanner.nextLine(); // Consumir la nueva línea
                    vehiculos.add(new Bicicleta(marcaBici, modeloBici, canasta));
                    break;

                case 3:
                    for (Vehiculos vehiculo : vehiculos) {
                        vehiculo.mostrarDetalles();
                        System.out.println();
                    }
                    break;

                case 4:
                    for (Vehiculos vehiculo : vehiculos) {
                        if (vehiculo instanceof Automovil) {
                            vehiculo.mostrarDetalles();
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    for (Vehiculos vehiculo : vehiculos) {
                        if (vehiculo instanceof Bicicleta) {
                            vehiculo.mostrarDetalles();
                            System.out.println();
                        }
                    }
                    break;

                case 6:
                    for (Vehiculos vehiculo : vehiculos) {
                        vehiculo.acelerar();
                    }
                    break;

                case 7:
                    for (Vehiculos vehiculo : vehiculos) {
                        vehiculo.frenar();
                    }
                    break;

                case 8:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
