import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro numero : ");
        int numeroDigitado1 = scan.nextInt();
        System.out.print("Digite o segundo numero : ");
        int numeroDigitado2 = scan.nextInt();
        scan.close();
        int resultado = numeroDigitado1 + numeroDigitado2;
        System.out.println("Resultado : " + resultado);
    }
    }
