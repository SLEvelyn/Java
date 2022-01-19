import java.util.Scanner;
import java.io.IOException;
public class raizPotenciaCuadrada
{
    public static void main (String args[]) throws IOException, InterruptedException{
       new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
       
       double valueA, valueB, potenciaA,potenciaB, raizCuadradaA, raizCuadradaB;
       
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Potencia y Raíz cuadrada");
       System.out.print("Ingrese valor A:  ");
       valueA = entrada.nextDouble();
       System.out.print("Ingrese valor B:  ");
       valueB = entrada.nextDouble();
       
       //Proceso del valor de A
       potenciaA = Math.pow(valueA, 2);
       raizCuadradaA= Math.sqrt(valueA);
       //Proceso del valor de B
       potenciaB = Math.pow(valueB, 2);
       raizCuadradaB= Math.sqrt(valueB);
       
       System.out.println("Resultado de la potencia cuadrada del valor de A:  " + potenciaA);
       System.out.println("Resultado de la raíz cuadrada del valor de A:  " + raizCuadradaA);
       
       System.out.println("Resultado de la potencia cuadrada del valor de B:  " + potenciaB);
       System.out.println("Resultado de la raíz cuadrada del valor de B:  "+ raizCuadradaB);
    }
}
