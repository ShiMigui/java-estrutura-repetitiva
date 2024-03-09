import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        short N = sc.nextShort();

        int fatorial = 1;
        for(short x = 1; x <= N; x++) fatorial *= x;

        System.out.println(fatorial);

        sc.close();
    }
}
