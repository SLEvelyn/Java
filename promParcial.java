import java.io.IOException;
import java.util.Scanner;
public class promParcial
{
    public static void main (String args[]) throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor(); 
        String apellido, curso, materia;
        //PI es primer insumo, SI es segundo insumo y P es promedio.
        double PI, SI, P;
        
        Scanner entrada = new Scanner(System.in);
        
        for(var i = 0; i <= 5; i++) {
            System.out.print("Apellidos: ");
            apellido = entrada.nextLine();
            
            System.out.print("Curso: ");
            curso = entrada.nextLine();
            
            System.out.print("Materia: ");
            materia = entrada.nextLine();
            
            System.out.print("Primer Insumo  ");
            PI = entrada.nextDouble();
        
            System.out.print("Segundo Insumo  ");
            SI = entrada.nextDouble();
        
            P = (PI+SI)/2;
        
            System.out.println("El promedio del parcial es:" + P);
            
        }
        
    }
}
