import java.util.Scanner;
import java.io.IOException;
public class cantidadDeDinero
{
    public static void main (String args[]) throws IOException, InterruptedException {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    
    double monedas50, monedas25, monedas10, monedas5,monedas1;
    double totalMonedas50,totalMonedas25,totalMonedas10,totalMonedas5,totalMonedas1, totalDolares;
    //Ingreso de datos
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Cantidad de dinero del usuario");
    System.out.print("Ingrese cantidad de monedas de $0.50: ");
    monedas50 = entrada.nextDouble();
    
    System.out.print("Ingrese cantidad de monedas de $0.25: ");
    monedas25 = entrada.nextDouble();
    
    System.out.print("Ingrese cantidad de monedas de $0.10: ");
    monedas10 = entrada.nextDouble();
    
    System.out.print("Ingrese cantidad de monedas de $0.05: ");
    monedas5 = entrada.nextDouble();
    
    System.out.print("Ingrese cantidad de monedas de $0.01: ");
    monedas1 = entrada.nextDouble();
    
    //Primer Proceso de Cáculo
    totalMonedas50 = monedas50 * 0.50;
    totalMonedas25 = monedas25 * 0.25;
    totalMonedas10 = monedas10 * 0.10;
    totalMonedas5 = monedas5 * 0.05;
    totalMonedas1 = monedas1 * 0.01;
    //Segundo Proceso de Cálculo
    totalDolares = (totalMonedas50 + totalMonedas25 + totalMonedas10 + totalMonedas5 + totalMonedas1);
    
    System.out.println("Total de dinero: $  " + totalDolares);
    
}
  
}
