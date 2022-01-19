import java.util.Scanner;
import java.io.IOException;
public class ecuacion
{
    public static void main (String args[]) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        //variable del valor de X y Y es la varible que se solicita obtener.
        Integer X, Y;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Obtener el valor de Y");
        System.out.print("Ingresa el valor de X:  ");
        X = entrada.nextInt();
        
        // Ecuación Y = 2X 2 + 4X + 12
        Y= 2*(X*X) + (4*X) + 12;
        
        System.out.println("El valor de Y es:  " + Y);
    }
}
