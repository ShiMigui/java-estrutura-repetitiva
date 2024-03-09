import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        short n = sc.nextShort();
        
        for (short i = 1; i <= n; i++) {
            System.out.printf("%d %d %d\n", i, (i * i), (i * i * i));
        }

        sc.close();
    }
}
