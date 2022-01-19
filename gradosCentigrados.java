import java.util.Scanner;
import java.io.IOException;
public class gradosCentigrados
{
    public static void main (String args []) throws IOException, InterruptedException{
        new ProcessBuilder ("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        // gradosFahrenheit es F,  gradosCentigrados es C.
        double F, C, round;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Conversión de grados Fahrenheit a grados Centígrados");
        System.out.print("Ingrese tempetarura en Fahrenheit: ");
        F = entrada.nextDouble();
        
        //Fórmula 
        C = (F - 32) * 5/9;
        
        //Fórmula propuesta por el docente
        // C = (9/5) C + 32;
        
        //Utilizé Math.round para redondear el resultado a dos decimales.
        round = Math.round(C*100.0)/100.0;
        
        System.out.println("La temperatura en grados Centígrados es: " + round + " C");
    }
}
