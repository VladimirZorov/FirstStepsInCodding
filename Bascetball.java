import java.util.Scanner;

public class Bascetball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taksa = Integer.parseInt(scanner.nextLine());
        double kec = taksa - 0.4 * taksa;
        double ekip = kec - 0.2 * kec;
        double topka = ekip * 0.25;
        double aksesoar = topka * 0.2;
        double total = taksa + kec + ekip + topka + aksesoar;
        System.out.println(total);
    }
}