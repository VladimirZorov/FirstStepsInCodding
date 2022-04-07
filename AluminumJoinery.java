import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brDogr = Integer.parseInt(scanner.nextLine());
        String dograma = scanner.nextLine();
        String dostavka = scanner.nextLine();

        double totalPrice = 0;

            switch (dograma) {
                case "90X130":
                    if (brDogr <= 30) {
                        totalPrice = brDogr * 110;
                    } else if (brDogr > 30 && brDogr <= 60) {
                        totalPrice = brDogr * 110 * 0.95;
                    } else if (brDogr > 60 && brDogr <= 99) {
                        totalPrice = brDogr * 110 * 0.92;
                    } else {
                        totalPrice = brDogr * 110 * 0.92;
                    }
                        break;
                case "100X150":
                    if (brDogr <= 40) {
                        totalPrice = brDogr * 140;
                    } else if (brDogr > 40 && brDogr <= 80) {
                        totalPrice = brDogr * 140 * 0.94;
                    } else if (brDogr > 80 && brDogr <= 99) {
                        totalPrice = brDogr * 140 * 0.90;
                    } else {
                        totalPrice = brDogr * 140 * 0.9;
                    }
                    break;
                case "130X180":
                    if (brDogr <= 20) {
                        totalPrice = brDogr * 190;
                    } else if (brDogr > 20 && brDogr <= 50) {
                        totalPrice = brDogr * 190 * 0.93;
                    } else if (brDogr > 50 && brDogr <= 99) {
                        totalPrice = brDogr * 190 * 0.88;
                    } else {
                        totalPrice = brDogr * 190 * 0.88;
                    }
                    break;
                case "200X300":
                    if (brDogr <= 25) {
                        totalPrice = brDogr * 250;
                    } else if (brDogr > 25 && brDogr <= 50) {
                        totalPrice = brDogr * 250 * 0.91;
                    } else if (brDogr > 50 && brDogr <= 99) {
                        totalPrice = brDogr * 250 * 0.86;
                    } else {
                        totalPrice = brDogr * 250 * 0.86;
                    }
                    break;
            }
        switch (dostavka) {
            case "With delivery":
                if (brDogr > 99) {
                    totalPrice = (totalPrice + 60) * 0.96;
                } else {
                    totalPrice = totalPrice + 60;
                }
                break;
            case "Without delivery":
                if (brDogr > 99) {
                    totalPrice = totalPrice * 0.96;
                } else {
                    totalPrice = totalPrice;
                }
                break;
        }
            if (brDogr <= 10) {
                System.out.println("Invalid order");
            } else {
                System.out.printf("%.2f BGN", totalPrice);
            }
    }
}
