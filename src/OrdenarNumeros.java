import java.util.Scanner;
    public class OrdenarNumeros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese cuatro números:");

            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();
            float num3 = scanner.nextFloat();
            float num4 = scanner.nextFloat();

            // Ordenar los números utilizando comparaciones
            if (num1 > num2) {
                float temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                float temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num3 > num4) {
                float temp = num3;
                num3 = num4;
                num4 = temp;
            }
            if (num1 > num2) {
                float temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                float temp = num2;
                num2 = num3;
                num3 = temp;
            }

            System.out.println("Los números ordenados son: " + num1 + " " + num2 + " " + num3 + " " + num4);

            scanner.close();
        }
    }