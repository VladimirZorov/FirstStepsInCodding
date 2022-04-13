import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brTopki = Integer.parseInt(scanner.nextLine());


        int black = 0;
        int otherCollor = 0;
        int totalPoints = 0;

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;

        for (int i = 1; i <= brTopki; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                totalPoints += 5;
                red ++;
            } else if (color.equals("orange")) {
                totalPoints += 10;
                orange ++;
            } else if (color.equals("yellow")) {
                totalPoints += 15;
                yellow ++;
            } else if (color.equals("white")) {
                totalPoints += 20;
                white ++;
            } else if (color.equals("black")) {
                totalPoints = totalPoints / 2;
                black ++;
            } else {
                otherCollor = otherCollor + 1;
            }

        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n",otherCollor);
        System.out.printf("Divides from black balls: %d%n", black);
    }
}
