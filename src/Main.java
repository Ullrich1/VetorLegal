import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetA[] = new int[5];
        int vetB[] = new int[5];

        for (int i=0; i<5; i++) {
            System.out.println("Digite um número inteiro: ");
            vetA[i] = ler.nextInt();
        }

        for (int i=0; i<5; i++) {
        vetB[i]=vetA[i]*2;
        }

        for (int i=0; i<5; i++) {
            System.out.print(vetB[i] + "\t");
        }
    }
}