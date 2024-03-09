import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número(1 a 1000): ");
        short N = sc.nextShort();

        for (short i = 1; i <= N; i++) if (i % 2 == 1) System.out.println(i);

        sc.close();
    }
}
