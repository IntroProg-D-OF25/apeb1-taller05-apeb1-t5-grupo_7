import java.util.Scanner;
/**
 *Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author Juan
 */
public class Ejercico3_Mayor3Numeros {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner tcl = new Scanner (System.in);
        System.out.println("Ingrese 3 Numeros");
        num1 = tcl.nextInt();
        num2 = tcl.nextInt();
        num3 = tcl.nextInt();
        if ((num1 < num2) && (num1 > num3))
            System.out.println("El numero mayor es: " + num1);
        else if ((num2 > num1) && (num2 > num3))
            System.out.println("El numero mayor es: " + num2);
        else if ((num3 > num2) && (num3 > num2))
            System.out.println("El numero mayor es: " + num3);
        else 
            System.out.println("Los numeros son iguales");
    } 
}
/***
 * Ingrese 3 Numeros
1 2 3
El numero mayor es: 3
 */