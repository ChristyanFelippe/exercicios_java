import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Digite o valor do raio a ser calculado a área : ");
        double value = scan.nextInt();
        double resultado = (value * value * pi);
        scan.close();
        System.out.println("\nO valor da área é " + resultado );
    }
    
}
