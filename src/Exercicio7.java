import java.util.Scanner;
import java.util.Locale;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pares: ");
        byte N = sc.nextByte();

        for(byte i = 0; i < N; i++){
            short dn, dv;

            System.out.print("Digite: ");
            dn = sc.nextShort();
            dv = sc.nextShort();
            if(dv == 0) System.out.println("divisao impossivel");
            else System.out.printf("%.1f\n", ((float) dn / dv));
        }

        sc.close();
    }
}
