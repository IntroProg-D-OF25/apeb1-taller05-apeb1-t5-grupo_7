import java.util.Scanner;
/**
 *Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author Juan Guerrero
 */
public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        int nota;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        nota = tcl.nextInt();
        if ((nota >= 90) && (nota <= 100))
        {
            System.out.println("Su nota es: A");
        } 
        else if ((nota >= 80) && (nota <=89))
            System.out.println("Su nota es: B");
        else if ((nota >= 70) && (nota <= 79))
            System.out.println("Su nota es: C");
        else
            System.out.println("Su nota es: D");       
    }    
}
/***
 * Ingrese una nota
85
Su nota es: B
 */