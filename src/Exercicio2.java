import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        byte x, y;

        System.out.print("Coordenadas: ");
        x = sc.nextByte();
        y = sc.nextByte();

        while (x != 0 && y != 0) {
            if(x>0){
                if(y>0) System.out.println("Primeiro");
                else System.out.println("Quarto");
            }
            else{
                if(y>0) System.out.println("Segundo");
                else System.out.println("Terceiro");
            }

            System.out.print("Coordenadas: ");
            x = sc.nextByte();
            y = sc.nextByte();
        }

        sc.close();
    }
}
