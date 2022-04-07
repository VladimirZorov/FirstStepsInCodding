import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String avioComp = scanner.nextLine();
        int ticketAdult = Integer.parseInt(scanner.nextLine());
        int ticketKids = Integer.parseInt(scanner.nextLine());
        double ticketAdultPrice = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double ticketKidsPrice = ticketAdultPrice *0.3;
        double sum = (ticketAdultPrice + tax) * ticketAdult + (ticketKidsPrice + tax) * ticketKids;
        double profit = sum * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", avioComp, profit);
    }
}
