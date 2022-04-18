import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int bestGoals = 0;
        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = input;
                bestGoals = goals;

            }
            if (goals >= 10) {
                break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (bestGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestGoals);
        } else if (bestGoals < 3) {
            System.out.printf("He has scored %d goals.", bestGoals);
        }
    }
}