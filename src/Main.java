import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();

        int opcion;

        do{
        System.out.println("""
                1.CREAR EMPLEADO
                2.MOSTRAR LISTA DE EMPLEADOS
                3.SALIR
                """);
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.println();
                System.out.println("Tipo de Empleado:");
                System.out.println("1. Empleado Planta");
                System.out.println("2. Empleado por Horas");
                System.out.println("3. Salir");
                System.out.print("Seleccione tipo: ");

                int tipo = scanner.nextInt();
                scanner.nextLine();


                System.out.print("Empleado: ");
                String Nombre = scanner.nextLine();
                System.out.print("Edad: ");
                String edad = scanner.nextLine();
                //scanner.nextLine();

                switch (tipo) {
                    case 1 -> {
                        listaEmpleados.add(new Planta(Nombre, edad, 2100000));
                    }
                    case 2 -> {
                        System.out.print("Horas trabajadas: ");

                        double HorasTrabajadas = scanner.nextDouble();
                        listaEmpleados.add(new PorHoras(Nombre, edad, 98000, (HorasTrabajadas * 98000)));
                    }
                    default -> {
                        System.out.println("Tipo de Empleado no valido");


                        System.out.println("Empleado creado exitosamente!\n");
                    }
                }
            }
            case 2 -> {
                if (listaEmpleados.isEmpty()) {
                    System.out.println("\nNo hay Empleados en la lista\n");
                } else {
                    System.out.println("\n=== Lista de Empleados ===");
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        System.out.println("Empleados " + (i + 1) + ":");
                        listaEmpleados.get(i).MostrarInfo();
                        System.out.println();
                    }
                }
            }
            case 3 -> {
                System.out.println("SALIENDO");
            }
            default -> {
                System.out.println("Opción no válida\n");
            }
        }
    }while (opcion != 3);

        scanner.close();



        }
}