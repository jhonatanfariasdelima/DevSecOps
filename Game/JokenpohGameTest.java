package Game;
public class JokenpohGameTest {
    public static void main(String[] args) {
        testPlayerWins();
        testComputerWins();
        testDraw();
        testInvalidInput();
    }

    private static void testPlayerWins() {
        System.out.println("Testing player wins...");
        int playerChoice = 0; // Pedra
        int computerChoice = 2; // Tesoura
        String result = determineWinner(playerChoice, computerChoice);
        if( result.equals("Você ganhou!")){
            System.out.println("\u001B[32mTest passed\u001B[0m");
        }else{
            System.out.println("\u001B[31mTest failed\u001B[0m");
        }
    }

    private static void testComputerWins() {
        System.out.println("Testing computer wins...");
        int playerChoice = 0; // Pedra
        int computerChoice = 1; // Papel
        String result = determineWinner(playerChoice, computerChoice);
        if( result.equals("O computador ganhou!")){
            System.out.println("\u001B[32mTest passed\u001B[0m");
        }else{
            System.out.println("\u001B[31mTest failed\u001B[0m");
        }
    }

    private static void testDraw() {
        System.out.println("Testing draw...");
        int playerChoice = 2; // Tesoura
        int computerChoice = 2; // Tesoura
        String result = determineWinner(playerChoice, computerChoice);
        if( result.equals("Empate!")){
            System.out.println("\u001B[32mTest passed\u001B[0m");
        }else{
            System.out.println("\u001B[31mTest failed\u001B[0m");
        }
    }

    private static void testInvalidInput() {
        System.out.println("Testing invalid input...");
        int playerChoice = 9; // Invalid choice
        int computerChoice = 1; // Papel
        String result = determineWinner(playerChoice, computerChoice);
        if(result.equals("Escolha invalida. Encerrando o jogo.")){
            System.out.println("\u001B[32mTest passed\u001B[0m");
        }else{
            System.out.println("\u001B[31mTest failed\u001B[0m");
        }
    }

    public static String determineWinner(int playerChoice, int computerChoice) {
        //{"pedra", "papel", "tesoura"}

        return JokenpohGame.Jogada(playerChoice, computerChoice);
    }

}
