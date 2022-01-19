

import java.util.Scanner;
import java.io.IOException;
public class factura
{
   public static void main (String args[]) throws IOException, InterruptedException{
       new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
       String F, Cl, RUC, Dom, Prod;
       Float Cant, PU, SUBT ,IVA, TP;
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Proceso de una factura");
       System.out.print("Fecha:  ");
       F = entrada.nextLine();
       
       System.out.print("Cliente:  ");
       Cl = entrada.nextLine();
       
       System.out.print("RUC:  ");
       RUC = entrada.nextLine();
       
       System.out.print("Domicilio:  ");
       Dom = entrada.nextLine();
       
       System.out.print("Producto:  ");
       Prod = entrada.nextLine();
       
       System.out.print("Cantidad:  ");
       Cant = entrada.nextFloat();
       
       System.out.print("Precio Unitario:  ");
       PU = entrada.nextFloat();
       
       SUBT = PU * Cant;
       IVA = (SUBT * 12)/100;
       TP = SUBT + IVA;
       
       System.out.println("EL subtotal es:  " + SUBT);
       System.out.println("IVA:  " + IVA);
       System.out.println("Total a pagar:  " + TP);
       
       
       
   }
}
