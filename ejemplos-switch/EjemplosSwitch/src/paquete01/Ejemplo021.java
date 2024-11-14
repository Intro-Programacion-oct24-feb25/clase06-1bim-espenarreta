/*

*/
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        System.out.println("Ingrese su día de nacimiento");
        int numeroDia = entrada.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int numeroMes = entrada.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        int numeroYear = entrada.nextInt();
        
        String cadena = "";
        
        switch (numeroMes) {
            case 1:
                cadena = "ENERO";
                break;

            case 2:
                cadena = "FEBRERO";
                break;

            case 3:
                cadena = "MARZO";
                break;

            case 4:
                cadena = "ABRIL";
                break;

            case 5:
                cadena = "MAYO";
                break;

            case 6:
                cadena = "JUNIO";
                break;

            case 7:
                cadena = "JULIO";
                break;

            case 8:
               cadena = "AGOSTO";
                break;

            case 9:
                cadena = "SEPTIEMBRE";
                break;

            case 10:
                cadena = "OCTUBRE";
                break;

            case 11:
                cadena = "NOVIEMBRE";
                break;
    
            case 12:
                cadena = "DICIEMBRE";
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }
        System.out.printf("Ustes a nacido el %d de %s de %d", numeroDia
                ,cadena, numeroYear);
    }
}
