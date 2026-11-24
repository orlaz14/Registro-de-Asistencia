import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        String nombre;

        while (true) {
            System.out.print("Nombre del estudiante (FIN termina): ");
            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            cantidad++;
        }

        System.out.println("Total de asistentes: " + cantidad);

        sc.close();
    }
}