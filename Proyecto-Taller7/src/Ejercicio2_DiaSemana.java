import java.util.Scanner;
/*
 * Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.).
 * @author Dostin Maza
 */
public class Ejercicio2_DiaSemana {
    public static void main(String[] args) {
        int num_dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de dia: ");
        num_dia = teclado.nextInt();
        switch (num_dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Error en el numero de dia");
        }
                
    }
}
 
/*
* run:
* Ingrese el numero de dia: 
* 6
* Sabado
 */