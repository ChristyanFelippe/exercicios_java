import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //<18>. Faça um Programa que peça dois números e imprima o maior deles.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número 1 : ");
        double number1 = scanner.nextDouble();
        System.out.print("Digite o número 2 : ");
        double number2 = scanner.nextDouble();
        if (number1 > number2) {
            System.out.println("O valor " + number1 + " é maior do que o valor " + number2);
        } else if (number1 < number2) {
            System.out.println("O valor " + number2 + " é maior do que o valor " + number1);
        } else {
            System.out.println("Os valores são equivalentes");
        }
        scanner.close();
    }
}
