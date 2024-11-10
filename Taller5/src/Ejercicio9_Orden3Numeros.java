import java.util.Scanner;
/**
 *Dados tres números, ordenarlos en orden ascendente.
 * @author Juan
 */
public class Ejercicio9_Orden3Numeros {
    public static void main(String[] args) {
        int Num1, Num2, Num3;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        Num1 = tcl.nextInt();
        System.out.println("Ingrese un numero");
        Num2 = tcl.nextInt();
        System.out.println("Ingrese un numero");
        Num3 = tcl.nextInt();
        if (Num1 > Num2)
        {
            Num1 = Num1 + Num2;
            Num2 = Num1 - Num2;
            Num1 = Num1 - Num2;           
        }  
        if (Num1 > Num3)
        {
            Num2 = Num1 + Num3;
            Num3 = Num1 - Num3;
            Num1 = Num1 - Num3;
        } 
        if (Num2 > Num3)
        {
            Num2 = Num2 + Num3;
            Num3 = Num2 - Num3;
            Num2 = Num2 - Num3;
        }   
        System.out.println("Los numeros ordenados en orden ascendente son: " + Num1 + "," + Num2 + "," + Num3);
    }
    
}
