import java.io.IOException;
import java.util.Scanner;
public class division
{
    public static void main (String args[]) throws IOException, InterruptedException {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    
    int primerNumero, segNumero, cociente, residuo;
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Cociente y residuo de la divisón");
    System.out.print("Ingresa el primer número: ");
    primerNumero = entrada.nextInt();
    
    System.out.print("Ingresa el segundo número: ");
    segNumero = entrada.nextInt();
    
    //Proceso
    cociente = primerNumero /  segNumero;
    residuo = primerNumero %  segNumero;
    
    //Salida
    System.out.println("El cociente es: " + cociente);
    System.out.println("El residuo es: " + residuo);
    }
}
