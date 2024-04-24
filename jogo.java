import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int MAX_TENTATIVAS = 3;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println(numeroAleatorio);
         
        while (tentativas < MAX_TENTATIVAS) {
            
            int palpite = scanner.nextInt();
            System.out.print("Tentativa " + (tentativas + 1) + ": ");
            System.out.println("Palpite: " + palpite);

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + (tentativas + 1) + " tentativas.");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
            
            tentativas++;
        }
        
        if (tentativas == MAX_TENTATIVAS) {
            System.out.println("Você esgotou todas as suas tentativas. O número era: " + numeroAleatorio);
        }
        
        scanner.close();
    }
}