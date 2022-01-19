import java.io.IOException;
import java.util.Scanner;
public class areaDeCirculo
{
    public static void main (String args[]) throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    //valor de pi
    double radio, pi, area;
    //Entrada de datos
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Área de un círculo");
    System.out.print("Ingrese radio de la circunferencia:  ");
    radio = entrada.nextDouble();
    
    //Valor de pi declarado
    pi = 3.1416;
    
    //Proceso o cálculo para obtener el área
    area = Math.round(pi * (Math.pow(radio, 2)));
    
    System.out.println("El área de un círculo es: " + area + " cm");
    
    }
}
