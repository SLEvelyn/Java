import java.io.IOException;
import java.util.Scanner;
public class segEjercicio
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        var x = 0;

        while (x < 3) {
            System.out.println( "Hola" );
            x++;
        }
    }
}
