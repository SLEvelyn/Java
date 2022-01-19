import java.io.IOException;
import java.util.Scanner;
public class tercerEjercicio
{
     public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor(); 
        
        var x = 0;
        
        do {
            System.out.println("Hola");
            x++;
        }
        while(x < 3);
    }
}
