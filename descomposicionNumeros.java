import java.util.Scanner;
import java.io.IOException;
public class descomposicionNumeros
{
    public static void main (String args[]) throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    //um es unidades de mil y dm son decenas de mil
    int numero, unidades, decenas, centenas, um, dm;
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Descomposición de número");
    System.out.print("Ingrese un número de 5 cifras: ");
    numero = entrada.nextInt();
    
    //Proceso
    unidades = (numero/1)%10;
    
    decenas = (numero/10)%10;
    
    centenas = (numero/100)%10;
    
    um = (numero/1000)%10;
    
    dm = (numero/10000)%10;
    
    System.out.println("Unidad: " + unidades);
    System.out.println("Decena: " + decenas);
    System.out.println("Centena: " + centenas);
    System.out.println("Unidad de mil: " + um);
    System.out.println("Decena de mil: " + dm);
    }
}
