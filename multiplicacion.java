import java.util.Scanner;
import java.io.IOException;
public class multiplicacion
{
    public static void main (String args[]) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        double num1, num2, result;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Multiplicación");
        System.out.print("Ingrese el primer número: ");
        num1 = entrada.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextDouble();
        
        result = num1 * num2;
       
    
        System.out.println("El resultado en multiplicación es: " + result);
    
    }
}
