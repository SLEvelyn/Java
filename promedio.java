
import java.util.Scanner;
import java.io.IOException;
public class promedio
{
   public static void main (String args[]) throws IOException, InterruptedException
   {
       new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        String name,materia;
        double primerQ, segQ, promFinal;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Promedio final");
        System.out.print("Nombre: ");
        name = entrada.nextLine();
        
        System.out.print("Materia: ");
        materia = entrada.nextLine();
        
        System.out.print("Promedio del primer quimestre:  ");
        primerQ = entrada.nextFloat();
        
        System.out.print("Promedio delsegundo quimestre:  ");
        segQ = entrada.nextFloat();
        
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
