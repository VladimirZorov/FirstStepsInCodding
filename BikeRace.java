import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        int totalPeople = juniors + seniors;
        double taxJuniors = 0;
        double taxSeniors = 0;

        switch (trace) {
            case "trail":
                taxJuniors = juniors * 5.5;
                taxSeniors = seniors * 7;
                break;
            case "cross-country":
                if (totalPeople >= 50) {
                    taxJuniors = juniors * 8 * 0.75;
                    taxSeniors = seniors * 9.5 * 0.75;
                } else {
                    taxJuniors = juniors * 8;
                    taxSeniors = seniors * 9.5;
                }
                break;
            case "downhill":
                taxJuniors = juniors * 12.25;
                taxSeniors = seniors * 13.75;
                break;
            case "road":
                taxJuniors = juniors * 20;
                taxSeniors = seniors * 21.5;
                break;
        }
        double result = (taxJuniors + taxSeniors) * 0.95;
        System.out.printf("%.2f", result);
    }
}
