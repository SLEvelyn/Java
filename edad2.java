import java.util.Scanner;
import java.io.IOException;
public class edad2
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        int e;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese edad: ");
        e = entrada.nextInt();
        
        if(e >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
