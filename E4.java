import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        float sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i +" (valor entre 0 a 10): ");
            float temp = scan.nextInt();
            sum += temp;
            System.out.println("writed " + temp);
            System.out.println("sum " + sum);
        }
        float nota = (sum / 4);
        System.out.println("Nota final : " + nota);
    }
}
