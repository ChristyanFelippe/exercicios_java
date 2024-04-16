import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nConversor de metros para cm");
        System.out.print("Digite o valor em metros a ser convertido : ");
        float value = scan.nextInt();
        float resultado = value * 100;
        scan.close();
        System.out.println("\nO valor de " + value + " metro(s) equivale a " + resultado + " centimetros.");
    }
}
