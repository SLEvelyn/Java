import java.io.IOException;
import java.util.Scanner;
public class primerEjercicio
{
    public static void main (String args[]) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
            for(var i=1;i<=3;i++) {
                System.out.println("Hola");
            }
    }
}
