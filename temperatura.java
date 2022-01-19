
import java.util.Scanner;
import java.io.IOException;

public class temperatura
{
    public static void main (String args[]) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        // variables de temperatura de hoy y temperatura del mes
        double TH, TM;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingresa los datos de la temperatura que se solicite");
        System.out.print("Temperatura máxima del mes:  ");
        TM = entrada.nextDouble();
        
        System.out.print("Temperatura medida de hoy:  ");
        TH = entrada.nextDouble();
        
        if(TH > TM)
        System.out.println("Temperatura actualizada");
        
    }
}
