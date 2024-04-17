import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        System.out.println("O valor");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado : ");

        double value = scan.nextInt();
        double resultado = (value * value * 2);
        scan.close();
        System.out.println("\nO valor do dobro da área é " + resultado);
    }
}
