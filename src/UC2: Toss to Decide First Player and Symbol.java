import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Randomly decide who starts and assign symbols
    static void tossAndAssignSymbols() {
        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display the result of toss
    static void displayTossResult() {
        System.out.println("Toss Result: - UC2: Toss to Decide First Player and Symbol.java:33");

        if (isHumanTurn) {
            System.out.println("Human plays first! - UC2: Toss to Decide First Player and Symbol.java:36");
        } else {
            System.out.println("Computer plays first! - UC2: Toss to Decide First Player and Symbol.java:38");
        }

        System.out.println("Human Symbol: - UC2: Toss to Decide First Player and Symbol.java:41" + humanSymbol);
        System.out.println("Computer Symbol: - UC2: Toss to Decide First Player and Symbol.java:42" + computerSymbol);
    }
}