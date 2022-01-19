import java.util.Scanner;
import java.io.IOException;
public class rombo
{
    public static void main (String args[]) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        // varibale diagM es la diagonal mayor, diagMn es la diagonal menor, L es lado, P es perímetro y A es área.
        double diagM, diagMn, L, P, A, potenciaCuadrada, raizCuadrada;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Área y Perímetro de un rombo");
        System.out.print("Ingrese diagonal mayor: ");
        diagM = entrada.nextDouble();
        
        System.out.print("Ingrese diagonal menor: ");
        diagMn = entrada.nextDouble();
        
        /*Procedimiento para obtener el lado del trapecio, utilizando Math.sqrt nos permite obtener la raíz cuadrada
         y Math.pow que nos permite obtener la potencia*/
        L = Math.sqrt (Math.pow((diagM / 2), 2) + Math.pow((diagMn / 2), 2));
        
        // Perímetro es la suma de todo sus lados
        P = L*4;
        //Área es la multiplicación de diagonal mayor y diagonal menor y el resultado se divide para 2. 
        A = (diagM * diagMn)/2;
        
        System.out.println("Perímetro:  " + P + " cm");
        System.out.println("Área:  " + A + " cm"); 
        
    }
}
