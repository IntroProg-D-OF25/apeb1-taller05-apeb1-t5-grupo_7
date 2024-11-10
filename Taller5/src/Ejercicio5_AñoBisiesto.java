import java.util.Scanner;
/**
 *Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 * @author Juan Guerrero
 */
public class Ejercicio5_AñoBisiesto {
    public static void main(String[] args) {
        int anio;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingresa un anio: ");
        anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0 )){
            System.out.println("El anio si es bisiesto");    
        }
        else{
            System.out.println("El anio no es bisiesto");
        }      
    }  
}
/***
 * Ingresa un anio: 
2013
El anio no es bisiesto
 */