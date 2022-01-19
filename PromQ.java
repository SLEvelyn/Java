import java.util.Scanner;
import java.io.IOException;
public class PromQ
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        //variables de nombre, curso y materia
        String N, C, M;
        //variables de primer quimestre, segundo quimestre, evaluación final, porcentaje, total y promedio final
        double PQ, SQ, EF, Pje, T, PF;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Calcular el promedio final de una materia");
        System.out.print("Nombre del estudiante  ");
        N = entrada.nextLine();
        
        System.out.print("Curso  ");
        C = entrada.nextLine();
        
        System.out.print("Materia  ");
        M = entrada.nextLine();
        
        System.out.print("Primer Quimestre  ");
        PQ = entrada.nextDouble();
        
        System.out.print("Segundo Quimestre  ");
        SQ = entrada.nextDouble();
        
        System.out.print("Evaluación final  ");
        EF = entrada.nextDouble();
        
        //proceso de cálculo para obtener el promedio final.
        //Primero se obtiene el 20% de la evaluacin final.
        Pje = (EF * 20)/100;
        //Se calcula el total, lo que implica sacar el promedio y obtener el 80%. 
        T = (((PQ + SQ)/2) * 80)/100;
        /* Para que finalmente se pueda obtener el promedio final, se debe sumar el porcentaje de la evaluación final y el total, que contiene el
           promedio con las notas del primer y segundo quimestre y obtenido el 80%. */
        PF = (Pje + T);
        
        System.out.println("Promedio final:" + PF);
        
        if (PF > 7)
        System.out.println("Aprobado");
        else if (PF >= 5.1)
        System.out.println("Supletorio");
        else if (PF <= 5)
        System.out.println("Remedial");
    }
}
