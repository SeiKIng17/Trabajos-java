import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su primer número: ");
        float n1 = scanner.nextFloat();

        System.out.println("Ingrese su segundo número: ");
        float n2 = scanner.nextFloat();

        float div = n1 / n2;
        System.out.println("La división es: " + div);

        float residuo = n1 % n2;
        System.out.println("El residuo es: " + residuo);

        scanner.close();
    }
}

