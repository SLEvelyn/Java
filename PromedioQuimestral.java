
import java.util.Scanner;
import java.io.IOException;
public class PromedioQuimestral
{
    public static void main (String args[]) throws IOException, InterruptedException
   {
       new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
       String N, C, M;
        float PQ, SQ, EF, Pje, T, PF;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Calcular el promedio final de una materia");
        System.out.print("Nombre del estudiante  ");
        N = entrada.nextLine();
        
        System.out.print("Curso  ");
        C = entrada.nextLine();
        
        System.out.print("Materia  ");
        M = entrada.nextLine();
        
        System.out.print("Primer Quimestre  ");
        PQ = entrada.nextFloat();
        
        System.out.print("Segundo Quimestre  ");
        SQ = entrada.nextFloat();
        
        System.out.print("Evaluación final  ");
        EF = entrada.nextFloat();
        
        Pje = (EF * 20)/100;
        T = (((PQ + SQ)/2) * 80)/100;
        PF = (Pje + T);
        
        System.out.println("Promedio final:" + PF);
        
    }
    
}
