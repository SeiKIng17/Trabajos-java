import java.time.LocalDate;
import java.util.Scanner;
public class CalcularEdad {
        public static void main(String[] args) {
            LocalDate currentDate = LocalDate.now();
            int dia = currentDate.getDayOfMonth();
            int mes = currentDate.getMonthValue();
            int anno = currentDate.getYear();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese su día de nacimiento: ");
            int diaNacimiento = scanner.nextInt();

            System.out.print("Ingrese su mes de nacimiento: ");
            int mesNacimiento = scanner.nextInt();

            System.out.print("Ingrese su año de nacimiento: ");
            int annoNacimiento = scanner.nextInt();

            int edad = anno - annoNacimiento;

            if (mesNacimiento > mes || (mesNacimiento == mes && diaNacimiento > dia)) {
                edad--;
            }

            System.out.println("Usted tiene " + edad + " años");

            scanner.close();
        }
    }


