import java.util.Scanner;
// librería de cl
import java.io.IOException;
public class areaCuadrado
{
    public static void main (String arg[]) throws IOException, InterruptedException {
         // limpiar pantalla 
       new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
       // variable de lado, área y perímetro
       Integer L, A, P;
       
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Determinar el área y perímetro de un cuadrado");
       System.out.print("Ingrese lado:  ");
       L = entrada.nextInt();
       //Fórmula de perímetro que sumar los lados del cuadrado
       P = L*4;
       //Fórmula del área que se multiplica dos lados
       A = L*L;
       
       System.out.println("El perímetro es:  " + P);
       System.out.print("El área es:  " + A);
        
    }
}
