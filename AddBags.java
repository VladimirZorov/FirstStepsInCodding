import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price20Kg = Double.parseDouble(scanner.nextLine());
        double kgBaggaj = Double.parseDouble(scanner.nextLine());
        int daysBefore = Integer.parseInt(scanner.nextLine());
        int broiBaggaj = Integer.parseInt(scanner.nextLine());

        double priceOt10Do20Kg = price20Kg * 0.5;
        double priceDo10Kg = price20Kg * 0.2;

        double totalPrice = 0;

        if (daysBefore < 7) {
            if (kgBaggaj < 10) {
                totalPrice = broiBaggaj * priceDo10Kg * 1.4;
            } else if (kgBaggaj <= 20) {
                totalPrice = broiBaggaj * priceOt10Do20Kg * 1.4;
            } else {
                totalPrice = broiBaggaj * price20Kg * 1.4;
            }
        } else if (daysBefore <= 30) {
            if (kgBaggaj < 10) {
                totalPrice = broiBaggaj * priceDo10Kg * 1.15;
            } else if (kgBaggaj <= 20) {
                totalPrice = broiBaggaj * priceOt10Do20Kg * 1.15;
            } else {
                totalPrice = broiBaggaj * price20Kg * 1.15;
            }
        } else {
            if (kgBaggaj < 10) {
                totalPrice = broiBaggaj * priceDo10Kg * 1.1;
            } else if (kgBaggaj <= 20) {
                totalPrice = broiBaggaj * priceOt10Do20Kg * 1.1;
            } else {
                totalPrice = broiBaggaj * price20Kg * 1.1;
            }
        }
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}