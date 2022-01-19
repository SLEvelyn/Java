
import java.util.Scanner;
import java.io.IOException;
public class NúmeroPositivo
{
 public static void main (String args[]) throws IOException, InterruptedException{
     new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
     int num;
     Scanner entrada = new Scanner (System.in);
     
     System.out.println("Determinar si el número es positivo.");
     System.out.print ("Ingrese número entero:");
     num = entrada.nextInt();
     
     if (num > 0)
     System.out.println("Número es positivo");
    }
}
