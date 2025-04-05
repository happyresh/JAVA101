import java.util.Scanner;
import java.util.Arrays;

public class RankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        scanner.close();
        
        // Store numbers in an array and sort in descending order
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        
        // Display numbers in descending order
        System.out.println("\nNumbers in descending order: " + numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
    }
}