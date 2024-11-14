/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        
        switch(cadena){
            case "Lunes":
            case "lunes":
            case "LuNeS":
            case "LUnes":
            case "luNES":
                System.out.printf("%s", cadena, cadena.toUpperCase());
                break;
            
            case "Martes":
            case "martes":
            case "MaRtEs":
            case "mArTeS":
            case "MARtes":
                System.out.printf("%s", cadena, cadena.toUpperCase());
                break;
            
            case "Miércoles" :
            case "MiÉrCoLeS" :
            case "mIéRcOlEs" :
            case "MIÉRcoles" :
            case "miércoles" :
            case "miercoles" :
            case "Miercoles" :
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
            case "Jueves" :
            case "jueves" :
            case "JuEvEs" :
            case "jUeVes" :
            case "JUEVES" :
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
            case "Viernes":
            case "VIERNES":
            case "viernes":
            case "ViErNeS":
            case "vIeRnEs":
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
            case "Sábado" :
            case "sábado" :
            case "SáBaDo" :
            case "sabado" :
            case "Sabado" :
            case "sAbÁdO" :
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
            case "Domingo":
                System.out.printf("%s, es el séptimo día "
                        + "de la semana", cadena.toUpperCase());
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
