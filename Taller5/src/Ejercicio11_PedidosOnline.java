import java.util.Scanner;
/**
 *
 * @author Juan Guerrero
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        String descripcion;
        int cantidad;
        double precioUnidad, CostoTotal, CostoDescuento;
        Scanner tcl = new Scanner(System.in);
        //SOLICITAR LA DESCRIPCION DEL ARTICULO
        System.out.println("Ingresar la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        //SOLICITAR LA CANTIDAD PEDIDA
        System.out.println("Ingrese la cantidad pedida: ");
        cantidad = tcl.nextInt();
        //SOLICITAR EL PRECIO DEL ARTICULO
        System.out.println("Ingrese el precio del articulo: ");
        precioUnidad = tcl.nextDouble();
        //CALCULAR EL PRECIO TOTAL SIN DESCUENTO
        CostoTotal = cantidad * precioUnidad;
        //APLICAR EL DESCUENTO SI SE SUPERA LAS 50 UNIDADES
        if (cantidad > 50)
        {
            CostoDescuento = CostoTotal * 0.85;  //15% de descuento
            System.out.println("El costo total sin descuento es: " + CostoTotal);
            System.out.println("El costo total Cosot con descuento es: " + CostoDescuento);     
        }    
        else 
        {
            System.out.println("El costo total es: " + CostoTotal);
        }
        
        
        
    }
    
}
