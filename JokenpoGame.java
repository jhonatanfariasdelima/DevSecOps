import java.util.Random;
import java.util.Scanner;

public class JokenpoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //se não conseguir ler do teclado?
        Random random = new Random();

        String[] choices = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Bem-vindo ao Jokenpô!");
        System.out.println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura");
        int playerChoice = scanner.nextInt();

        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("Escolha inválida. O programa será encerrado.");
            return;
        }

        int computerChoice = random.nextInt(3);

        System.out.println("Você escolheu: " + choices[playerChoice]);
        System.out.println("O computador escolheu: " + choices[computerChoice]);

        if (playerChoice == computerChoice) {
            System.out.println("Empate!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                   (playerChoice == 1 && computerChoice == 0) ||
                   (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }
    }
}
