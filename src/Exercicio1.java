import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int nm_senha = sc.nextInt();

        while (nm_senha != 2002) {
            System.out.println("Senha Invalida");

            System.out.print("Digite a senha: ");
            nm_senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
