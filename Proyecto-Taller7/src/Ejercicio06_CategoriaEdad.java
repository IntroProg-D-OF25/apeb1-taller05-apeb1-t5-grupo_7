import java.util.Scanner;
/*
 * Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
 * @author Dostin Maza
 */
public class Ejercicio06_CategoriaEdad {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        if (edad < 13)
            System.out.println("ES UN NIÑO");
        else if (edad < 25)
            System.out.println("ES UN ADOLESCENTE");
        else
            System.out.println("ES UN ADULTO");  
    }
}

/*
* run:
* Ingrese su edad
* 27
* ES UN ADULTO
 */