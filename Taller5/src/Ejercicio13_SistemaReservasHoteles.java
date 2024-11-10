import java.util.Scanner;
/**
 *En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author Juan Guerrero
 */
public class Ejercicio13_SistemaReservasHoteles {
    public static void main(String[] args){
        int dias;
        double precio;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese los dias de hospedaje del cliente");
        dias = tcl.nextInt();
        System.out.println("Ingrese el precio de la habitacion por dia");
        precio = tcl.nextDouble();
        if (dias <= 5){
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.90));
        }
        else if (dias < 10){
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.90));
        }
        else if (dias < 15){
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.85)); 
        }
        else if (dias > 15){
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.80));
        }    
    }
}    
    
    

