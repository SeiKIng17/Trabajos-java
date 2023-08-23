 import java.util.Scanner;
    public class LetraNumero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un carácter: ");
            String letraONumero = scanner.nextLine();

            // Verificar si es una letra (mayúscula o minúscula)
            if (letraONumero.matches("[a-zA-Z]")) {
                System.out.println("Es una letra.");
            }
            // Verificar si es un número
            else if (letraONumero.matches("[0-9]")) {
                while (true) {
                    System.out.print("Ingrese el siguiente carácter o presione Enter para terminar: ");
                    String siguienteCaracter = scanner.nextLine();
                    if (siguienteCaracter.equals("")) {
                        break;
                    } else if (siguienteCaracter.matches("[0-9]")) {
                        letraONumero += siguienteCaracter;
                    } else {
                        System.out.println("No es un número válido.");
                    }
                }
                System.out.println("Es un número: " + letraONumero);
            } else {
                System.out.println("No es ni una letra ni un número.");
            }

            scanner.close();
        }
    }
