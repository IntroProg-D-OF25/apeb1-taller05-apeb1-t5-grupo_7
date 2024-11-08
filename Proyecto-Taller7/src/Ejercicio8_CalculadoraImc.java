import java.util.Scanner;
/*
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author Dostin Maza
 */
public class Ejercicio8_CalculadoraImc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num_imc;
        System.out.print("Ingrese su peso en kg: ");
        num_imc = teclado.nextInt();
        if (num_imc <= 40) {
            System.out.println("Bajo peso");
        } 
        else if (num_imc <= 80) 
        {
            System.out.println("Peso normal");
        } 
        else if (num_imc > 80) {
            System.out.println("Sobrepeso");
        }   
    }
}

/*
* run:
* Ingrese su peso en kg: 70
* Peso normal
 */