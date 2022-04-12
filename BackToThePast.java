import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        double spendMoney = 0;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                spendMoney += 12000;
            } else {
                spendMoney += 12000 + 50 * (i - 1800 + 18);
            }
        }
        double result = Math.abs(money - spendMoney);
        if (spendMoney <= money) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", result);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", result);
        }
    }
}