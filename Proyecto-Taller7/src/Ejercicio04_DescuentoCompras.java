import java.util.Scanner;
/*
 * Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.
 * @author Dostin Maza
 */
public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        int descuento;
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Dame el precio de la compra de un producto");
        descuento = teclado.nextInt();
        if(descuento > 100)
            System.out.println("Aplica al descuento");
        else
            System.out.println("No aplica al descuento");
    }
}

/*
* run:
* Dame el precio de la compra de un producto
* 101
Aplica al descuento
 */