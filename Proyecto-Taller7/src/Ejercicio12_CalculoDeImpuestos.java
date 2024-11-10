import java.util.Scanner;
/***
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 * @author Dostin Maza
 */
public class Ejercicio12_CalculoDeImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo,impuesto = 0, precioVenta;
        System.out.print("Ingrese la marca del automóvil: ");
        String marca = tcl.nextLine();
        System.out.print("Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): ");
        String origen = tcl.nextLine();
        System.out.print("Ingrese el costo del automóvil: ");
        costo = tcl.nextDouble();
        switch (origen) {
            case "Alemania":
                impuesto = costo * 0.20; 
                break;
            case "Japón":
                impuesto = costo * 0.30; 
                break;
            case "Italia":
                impuesto = costo * 0.15; 
                break;
            case "USA":
                impuesto = costo * 0.08; 
                break;
            default:
                System.out.println("Origen no reconocido. No se calculará impuesto.");
                return; 
        }
        precioVenta = costo + impuesto;
        System.out.printf("Impuesto por pagar: %.2f%n", impuesto);
        System.out.printf("Precio de venta (incluido el impuesto): %.2f%n", precioVenta);
    }
}

/***
* Ingrese la marca del autom�vil: toyota
* Ingrese el origen del autom�vil (Alemania, Jap�n, Italia, USA): USA
* Ingrese el costo del autom�vil: 10000
* Impuesto por pagar: 800,00
* Precio de venta (incluido el impuesto): 10800,00
/***
* Ingrese la marca del autom�vil: toyota
* Ingrese el origen del autom�vil (Alemania, Jap�n, Italia, USA): Alemania
* Ingrese el costo del autom�vil: 10000
* Impuesto por pagar: 2000,00
* Precio de venta (incluido el impuesto): 12000,00
/***
* Ingrese la marca del autom�vil: toyota
* Ingrese el origen del autom�vil (Alemania, Jap�n, Italia, USA): Japón
* Ingrese el costo del autom�vil: 10000
* Impuesto por pagar: 3000,00
* Precio de venta (incluido el impuesto): 13000,00
/***
* Ingrese la marca del autom�vil: toyota
* Ingrese el origen del autom�vil (Alemania, Jap�n, Italia, USA): Italia
* Ingrese el costo del autom�vil: 10000
* Impuesto por pagar: 1500,00
* Precio de venta (incluido el impuesto): 11500,00
*/