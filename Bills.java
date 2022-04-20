import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monts = Integer.parseInt(scanner.nextLine());
        double tok = 0.0;
        double voda = 0.0;
        double internet = 0.0;
        double drugi = (tok + voda + internet) * 1.2;
        for (int i = 1; i <= monts; i++) {
            voda += 20;
            internet += 15;
            double input = Double.parseDouble(scanner.nextLine());
            tok += input;
            drugi += (input + 20 + 15) * 1.2;
        }
        double average = (tok + voda + internet + drugi) / monts;
        System.out.printf("Electricity: %.2f lv%n", tok);
        System.out.printf("Water: %.2f lv%n", voda);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", drugi);
        System.out.printf("Average: %.2f lv", average);

    }
}
