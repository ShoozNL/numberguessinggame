import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> easyNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    public static List<Integer> hardNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);

    public static void main(String[] args) {
        System.out.println("Hello! This is a number guessing game!");
        String difficulty = getDifficulty();
        int selectedNumber = getNumber(difficulty);
        playGame(selectedNumber, difficulty);
    }

    private static int getNumber(String difficulty) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int selectedNumber = scanner.nextInt();

        //based on the difficulty, check if the number is in the list
        if (difficulty.equals("easy")) {
            while (!easyNumbers.contains(selectedNumber)) {
                System.out.println("That number is not in the list!");
                System.out.print("Enter a number: ");
                selectedNumber = scanner.nextInt();
            }
        } else if (difficulty.equals("hard")) {
            while (!hardNumbers.contains(selectedNumber)) {
                System.out.println("That number is not in the list!");
                System.out.print("Enter a number: ");
                selectedNumber = scanner.nextInt();
            }
        }

        return selectedNumber;
    }

    private static void playGame(int selectedNumber, String difficulty) {
        //based on the difficulty, loop until the user guesses the right number
        if (difficulty.equals("easy")) {
            while (selectedNumber != easyNumbers.get(0)) {
                System.out.println("You guessed wrong!");
                selectedNumber = getNumber(difficulty);
            }
        } else if (difficulty.equals("hard")) {
            while (selectedNumber != hardNumbers.get(0)) {
                System.out.println("You guessed wrong!");
                selectedNumber = getNumber(difficulty);
            }
        }
    }

    private static int getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    private static String getDifficulty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the difficulty level: easy or hard? ");
        return scanner.next();
    }
}