
import java.util.Scanner;
import java.io.IOException;
public class pulgadas
{
    public static void main (String args[]) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        // varible in es la abreviatura de pulgadas y cm es la abreviatura de centímetros.
        double in, cm, round;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Convesión de Pulgadas a Centímetros");
        System.out.print("Longitud en pulgadas:  ");
        in = entrada.nextDouble();
        // Para hacer la conversión se debe dividir el valor en pulgadas para 0.39370
        cm = in / 0.39370;
        //Utilizé Math.round para redondear el resultado a dos decimales.
        round = Math.round(cm*100.0)/100.0;
        
        System.out.println("Longitud de pulgadas a centímetros es:  " + round + " cm");
    }
}
