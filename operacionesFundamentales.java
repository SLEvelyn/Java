import java.util.Scanner;
import java.io.IOException;
public class operacionesFundamentales
{
    public static void main (String args[]) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        Integer num1, num2, suma, resta, multiplicacion, division, residuo;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Operaciones fundamentales");
        System.out.print("Ingrese el primer número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        residuo = num1 % num2;
        
        System.out.println("El resultado en suma es: " + suma);
        System.out.println("El resultado en resta es: " + resta);
        System.out.println("El resultado en multiplicación es: " + multiplicacion);
        System.out.println("El resultado en división es: " + division);
        System.out.println("El resultado en residuo es: " + residuo);
    }
}
