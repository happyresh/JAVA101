import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String player1Choice, player2Choice;
        
        // Get Player 1 input
        while (true) {
            System.out.print("Player 1, enter your choice (rock, paper, or scissors): ");
            player1Choice = scanner.next().toLowerCase();
            if (isValidChoice(player1Choice)) break;
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
        }
        
        // Get Player 2 input
        while (true) {
            System.out.print("Player 2, enter your choice (rock, paper, or scissors): ");
            player2Choice = scanner.next().toLowerCase();
            if (isValidChoice(player2Choice)) break;
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
        }
        
        scanner.close();
        
        // Display choices
        System.out.println("\nPlayer 1 chose: " + player1Choice);
        System.out.println("Player 2 chose: " + player2Choice);
        
        // Determine winner
        String result = determineWinner(player1Choice, player2Choice);
        System.out.println(result);
    }
    
    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }
    
    private static String determineWinner(String p1, String p2) {
        if (p1.equals(p2)) {
            return "It's a tie!";
        }
        
        if ((p1.equals("rock") && p2.equals("scissors")) || 
            (p1.equals("scissors") && p2.equals("paper")) || 
            (p1.equals("paper") && p2.equals("rock"))) {
            return "Player 1 wins! " + capitalize(p1) + " beats " + capitalize(p2) + ".";
        }
        
        return "Player 2 wins! " + capitalize(p2) + " beats " + capitalize(p1) + ".";
    }
    
    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}