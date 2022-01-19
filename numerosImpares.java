import java.io.IOException;
import java.util.Scanner;
public class numerosImpares
{
    public static void main (String args[]) throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    
    System.out.println("Los números impares del 1 al 15 son: ");
    
    for(var impar = 1;impar<=15; impar= impar + 2) {
        System.out.println(impar);
    }
    }
}
