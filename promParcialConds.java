
import java.util.Scanner;
import java.io.IOException;
public class promParcialConds
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        //variables de nombre, curso y materia
        String N, C, M;
        
        //variables de primer insumo, segundo insumo y promedio
         double PI, SI, P;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Calcular la nota promedio en un parcial");
         System.out.print("Nombre del estudiante  ");
        N = entrada.nextLine();
        
        System.out.print("Curso  ");
        C = entrada.nextLine();
        
        System.out.print("Materia  ");
        M = entrada.nextLine();
        
        System.out.print("Primer Insumo  ");
        PI = entrada.nextDouble();
        
        System.out.print("Segundo Insumo  ");
        SI = entrada.nextDouble();
        // proceso de cálculo del promedio de parcial de una materia
        P = (PI+SI)/2;
        System.out.println("El promedio del parcial es:" + P);
        
        if(P >= 9.1) 
        System.out.println("Sobresaliente");
         else if (P > 8.1)
        System.out.println("Muy bueno"); 
         else if (P >= 7) 
         System.out.println("Bueno");
         else if(P >= 5.1)
         System.out.println("Regular");
         else if (P < 5)
         System.out.println("Deficiente");
    }
}
