import java.util.Scanner;
import java.io.IOException;
public class numerosParesImpares
{
    public static void main (String args []) throws IOException, InterruptedException{
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor(); 
    
    int number=0, res;
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Determinar si un número es par o impar");
    
    
    while(number >= 0) {
        System.out.print("Ingrese un número entero positivo: ");
        number = entrada.nextInt();
        if(number >= 0){
                res = number % 2;
        if(res != 0) {
            System.out.println("Número impar");
        } else {
            System.out.println("Número par");
            }
        }

        }
        System.out.println("Número ingresado incorrecto");
    }
}
