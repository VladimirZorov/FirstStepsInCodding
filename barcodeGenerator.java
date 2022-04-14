import java.util.Scanner;

public class barcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        char start1 = start.charAt(0);
        char start2 = start.charAt(1);
        char start3 = start.charAt(2);
        char start4 = start.charAt(3);
        char end1 = end.charAt(0);
        char end2 = end.charAt(1);
        char end3 = end.charAt(2);
        char end4 = end.charAt(3);
        for (char i = start1; i <= end1; i++) {
            for (char j = start2; j <= end2; j++) {
                for (char k = start3; k <= end3; k++) {
                    for (char l = start4; l <= end4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
