import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de valores: ");
        short N = sc.nextShort();

        byte in, out;
        in = out = 0;

        for(short x = 0; x < N; x++) 
        {
            System.out.print("Número: ");
            short n = sc.nextShort();
            
            if(10 <= n && n >= 20) in++;
            else out++;
        }

        System.out.printf("%d in\n%d out", in, out);

        sc.close();
    }
}
