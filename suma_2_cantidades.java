import java.io.IOException;
import java.util.Scanner;
public class suma_2_cantidades
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        int num1, num2, result;
        Scanner entrada = new Scanner (System.in);
    
        System.out.println("Suma");
        System.out.println("Primer número: ");
        num1= entrada.nextInt();
        
        System.out.println("Segundo número: ");
        num2 = entrada.nextInt();
        
        result=num1+num2;
        System.out.println("Resultado:  " + result);
    }
}
