import java.io.IOException;
import java.util.Scanner;
public class estatura
{
    public static void main (String args[]) throws IOException , InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    
    double primerVoluntario, segVoluntario, tercerVoluntario, cuartoVoluntario, promEstaturas;
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Estaturas registradas");
    System.out.print("Estatura del primer voluntario: ");
    primerVoluntario = entrada.nextDouble();
    
    System.out.print("Estatura del segundo voluntario: ");
    segVoluntario = entrada.nextDouble();
    
    System.out.print("Estatura del tercer voluntario: ");
    tercerVoluntario = entrada.nextDouble();
    
    System.out.print("Estatura del cuarto voluntario: ");
    cuartoVoluntario = entrada.nextDouble();
    
    //Proceso para obtener el promedio de las estaturas
    promEstaturas = (primerVoluntario + segVoluntario + tercerVoluntario + cuartoVoluntario)/4;
    
    System.out.println("Promedio de estaturas registradas: " + promEstaturas);
    }
}
