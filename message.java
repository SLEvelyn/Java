import java.io.IOException;
public class message
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        System.out.println("Hola");
    }
}
