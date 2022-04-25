import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int kurs = (int) Math.ceil(x*1.0 / (w*m));

        System.out.print(kurs);
    }
}
