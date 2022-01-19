// importa la clase Scanner 
import java.util.Scanner;
// librería de cl
import java.io.IOException;
public class partido
{
 public static void main (String args[]) throws IOException, InterruptedException
   {
       // limpiar pantalla 
       new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
       // variables de nombre del equipo local y de equipo visitante
       String NEL, NEV;
       /* variable de goles del equipo local (GEL), variable de goles del equipo visitante (GEV); estas variables van a guardar el número de
          goles que cada equipo haya hecho*/
       Integer GEL, GEV;
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Resultados del partido");
        System.out.print("Nombre del equipo local  ");
        NEL = entrada.nextLine();

        System.out.print("Nombre del equipo visitante  ");
        NEV = entrada.nextLine();
        
        // Al poner el + se esta adicionando el dato que se ingreso que es el nombre del equipo local junto con el mensaje "Goles de "
        System.out.println("Goles de " +  NEL);
        GEL = entrada.nextInt();
        
        // Al poner el + se esta adicionando el dato que se ingreso que es el nombre del equipo visitante junto con el mensaje "Goles de "
        System.out.println("Goles de " +  NEV);
        GEV = entrada.nextInt();
        
        //SI los goles del equipo local es mayor a los del equipo visitante, es el ganador
        if (GEL > GEV)
        System.out.println("El ganador es  "+ NEL);
        else if(GEL == GEV)
        System.out.println("Empate");
        else 
        System.out.println("El ganador es  "+ NEV);
    }
}
