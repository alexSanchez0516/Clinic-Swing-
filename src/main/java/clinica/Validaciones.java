
package clinica;

import java.util.regex.Pattern;

/**
 * 
 * @author Alexander
 */
public class Validaciones {

     public static boolean validadarDni(String Dni) {
            
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z-K]";
        
        return Pattern.matches(dniRegexp, Dni);
        
    }
     
     
     public static boolean validadCadena(String nombre) {                
        String nombreRegex = "[A-ZÑa-zñ ]*"; //Comprueba que sean letras y minimo 3 letras mayusculas o minusculas y maximo 10
        return Pattern.matches(nombreRegex, nombre);
    }
    
}
