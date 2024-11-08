import java.util.Scanner;

/*
 * Facturación eléctrica: Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la tercera edad.
 * @author Dostin Maza
 */
public class Ejercicio10_FacturacionElectrica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        double valor_Kilovatio, total_pagar;
        double numero_consumidos;
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        System.out.println("Ingresa el costo de kilovatio consumidos");
        valor_Kilovatio = teclado.nextDouble();
        System.out.println("Ingresa la cantidad de kilovatio consumidos por hora");
        numero_consumidos = teclado.nextDouble();
        total_pagar = valor_Kilovatio * numero_consumidos;
        if (edad > 65){
            total_pagar = total_pagar - (total_pagar * 0.10);
        }else{
            total_pagar = total_pagar;
        }
            System.out.println("Total a pagar es: " + total_pagar);
            
        
    }
}

/*
* run:
* Ingrese el costo por kilovatio/hora: 4
* Ingrese la cantidad de kilovatios consumidos: 120
* Ingrese su edad: 68
* El total a pagar es:432.0
 */