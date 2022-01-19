import java.util.Scanner;
import java.io.IOException;
public class edades
{
    public static void main (String args[]) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO() .start() .waitFor();
        
        String name;
        int age;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Edades");
        System.out.print("Ingrese su nombre: ");
        name = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        age = entrada.nextInt();
        
        if(age >= 65) {
            System.out.println("Tercera edad");
        } else if(age >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
