import java.util.Scanner;
import java.io.IOException;
public class trapecioRectangulo
{
    public static void main(String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        double baseMayor, baseMenor, altura, lado, P, A;
        //Ingreso de datos
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Trapecio rectángulo");
        System.out.print("Ingrese base mayor:  ");
        baseMayor = entrada.nextDouble();
        
        System.out.print("Ingrese base menor:  ");
        baseMenor = entrada.nextDouble();
        
        System.out.print("Ingrese altura:  ");
        altura = entrada.nextDouble();
        
        //Fórmula para obtener el lado
        lado = Math.sqrt(Math.pow((baseMayor - baseMenor),2) + Math.pow(altura,2));
        //Fórmula para obtener el Perímetro
        P = (baseMayor + baseMenor + altura + lado);
        //Fórmula para obtener el área
        A = (((baseMayor + baseMenor)/2) * altura);
        
        System.out.println("Perímetro:  " + P + "cm");
        System.out.println("Área:  " + A + "cm");  
    }
    
}
