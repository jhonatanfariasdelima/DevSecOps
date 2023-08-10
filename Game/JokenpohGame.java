package Game;
import java.util.Random;
import java.util.Scanner;


public class JokenpohGame {

    static String Start(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Bem-vindo ao Jokenpoh!");
        System.out.println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura");
        int playerChoice = scanner.nextInt();

        int computerChoice = random.nextInt(3);

        String resultado = Jogada(playerChoice, computerChoice);
        System.out.println(resultado);
        return resultado;
    }

    static String Jogada(int playerChoice, int computerChoice) {
        String[] choices = {"pedra", "papel", "tesoura"};

        if (playerChoice < 0 || playerChoice > 2) {
            //System.out.println("Escolha inválida. Encerrando o jogo.");
            return "Escolha invalida. Encerrando o jogo.";
        }

        System.out.println("Você escolheu: " + choices[playerChoice]);
        System.out.println("O computador escolheu: " + choices[computerChoice]);

        if (playerChoice == computerChoice) {
            //System.out.println("Empate!");
            return "Empate!";
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                   (playerChoice == 1 && computerChoice == 0) ||
                   (playerChoice == 2 && computerChoice == 1)) {
            //System.out.println("Você ganhou!");
            return "Você ganhou!";
        } else {
            //System.out.println("O computador ganhou!");
            return "O computador ganhou!";
        }

    }

    public static void main(String[] args) {
        Start();
    }
}
