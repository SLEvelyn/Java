
import java.util.Scanner;
import java.io.IOException;
public class numeroDia
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        Integer horas, minutos, numeroDias ,numeroHoras, numeroMinutos;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Número de horas y minutos");
        System.out.print("Ingrese número de días:  ");
        numeroDias = entrada.nextInt();
        
        horas = 24;
        minutos = 60;
        
        numeroHoras = horas * numeroDias;
        numeroMinutos = numeroHoras * minutos;
        
        System.out.println("Número de horas: " + numeroHoras);
        System.out.println("Número de minutoss: " + numeroMinutos);
    }
    
}
