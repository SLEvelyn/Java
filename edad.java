import java.io.IOException;
import java.util.Scanner;
public class edad
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        int e;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese edad: ");
        e = entrada.nextInt();
    }
}
