import java.io.IOException;
import java.util.Scanner;
public class cambioValores
{
    public static void main (String args[]) throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    //variable X y variable Y
    int x, y;
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Valores de X y Y");
    System.out.print("Valor de X: ");
    x = entrada.nextInt();
    
    System.out.print("Valor de Y: ");
    y = entrada.nextInt();
    
    System.out.println("Cambio de valores de X y Y");
    System.out.println("Valor de X: " + y);
    
    System.out.println("Valor de Y: " + x);
    
    
    
    }
}
