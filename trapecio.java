import java.util.Scanner;
import java.io.IOException;
public class trapecio
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    
        // L es la variable de los lados, h es la altura, P es perímetro y A es el área.
        double baseMayor, baseMenor, h, L, P, A, potenciaCuadrada, raizCuadrada;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Área y Perímetro de un trapecio Isósceles");
        System.out.print("Ingrese base mayor:  ");
        baseMayor = entrada.nextDouble();
        
        System.out.print("Ingrese base menor:  ");
        baseMenor = entrada.nextDouble();
        
        System.out.print("Ingrese altura:  ");
        h = entrada.nextDouble();
        
        //Procedimiento para obtener el lado del trapecio.
        L = Math.sqrt(Math.pow((baseMayor - baseMenor),2) + Math.pow(h,2));
          
        //Para obtener el peímetro se necesita sumar todos los lados del trapecio
        P = baseMayor + baseMenor + (2*L);
        //Para obtener el área se debe sumar base mayor y base menor, dividirla para dos y el resultado multiplicarlo con la altura.
        A = (baseMayor + baseMenor)/2 * h;
        
        System.out.println("Perímetro:  " + P + "cm");
        System.out.println("Área:  " + A + "cm");
    }
}
