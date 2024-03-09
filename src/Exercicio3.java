import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        byte cd, a, g, d;

        a = g = d = 0;

        System.out.println("1. Álcool\n2.Gasolina\n3.Diesel\n4.Fim");
        System.out.print("Digite um código: ");
        cd = sc.nextByte();

        while (cd != 4) {
            if (cd > 0 && cd < 4) {
                if (cd == 1) a++;
                else if (cd == 2) g++;
                else d++;
            }
            else System.out.println("Código inválido");

            System.out.print("Digite um código: ");
            cd = sc.nextByte();
        }

        System.out.printf("MUITO OBRIGADO\nÁlcool: %d\nGasolina: %d\nDiesel: %d", a, g, d);

        sc.close();
    }
}
