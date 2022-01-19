import java.io.IOException;
import java.util.Scanner;
public class cajero
{
    public static void main (String args[]) throws IOException, InterruptedException {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
    //Número de cuenta y cantidad de dinero que se va a retirar es cantRetirar.
    int numCuenta, cantRetirar, cantBilletes20, cantBilletes10, cantBilletes5, cantBilletes1;
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Cajero automático");
    System.out.print("Ingrese el número de cuenta: ");
    numCuenta = entrada.nextInt();
    
    System.out.print("Ingrese la cantidad de dinero que desea retirar: $ ");
    cantRetirar = entrada.nextInt();
    
    //Proceso
    cantBilletes20 =  cantRetirar / 20;
    cantBilletes10 =  cantRetirar / 10;
    cantBilletes5 =  cantRetirar / 5;
    cantBilletes1 =  cantRetirar / 1;
    
    //Salida de datos
    System.out.println("Cantidad de billetes de $20:  " + cantBilletes20);
    System.out.println("Cantidad de billetes de $10:  " + cantBilletes10);
    System.out.println("Cantidad de billetes de $5:  " + cantBilletes5);
    System.out.println("Cantidad de billetes de $1:  " + cantBilletes1);
    }
}
