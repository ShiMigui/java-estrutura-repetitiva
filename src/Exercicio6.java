import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de testes: ");
        byte N = sc.nextByte();

        for(byte i =0; i<N;i++){
            System.out.print("Números: ");
            float a, b, c;
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();

            System.out.printf("%.1f\n", ((a * 2 + b * 3 + c * 5) / 10));
        }

        sc.close();
    }
}
