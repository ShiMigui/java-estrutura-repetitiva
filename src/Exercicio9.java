import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n / 2; i++) if (n % i == 0) System.out.println(i);
        System.out.println(n);

        sc.close();
    }
}
