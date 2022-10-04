import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = Main.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = Main.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();

        GiaiPTBac2.PTBac2(a, b, c);

    }
}