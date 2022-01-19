
import java.util.Scanner;
import java.io.IOException;
public class validarDatos
{
   public static void main (String args[]) throws IOException, InterruptedException
   {
       new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        String name,materia;
        double  primerQ, segQ, promFinal;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Promedio final");
        System.out.print("Nombre: ");
        name = entrada.nextLine();
        
        System.out.print("Materia: ");
        materia = entrada.nextLine();
            
        do {
            System.out.print("Promedio del primer quimestre:  ");
            primerQ = entrada.nextDouble();
        } while(primerQ < 1 || primerQ > 10);
        
        do {
            System.out.print("Promedio del segundo quimestre:  ");
            segQ = entrada.nextDouble();
        } while (segQ < 1 || segQ > 10);
        
        
        promFinal = (primerQ+segQ)/2;
        
        System.out.println("Promedio final: :" + promFinal);
        
        if(promFinal >= 7) {
            System.out.println("Aprobado");
        } else if(promFinal >= 5){
            System.out.println("Supletorio");
        } else {
            System.out.println("Remedial");
        }
        
   }
}
