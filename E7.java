import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado : ");

        double value = scan.nextInt();
        double resultado = (value * value * 2);
        scan.close();
        System.out.println("\nO valor do dobro da área é " + resultado);
    }
}
