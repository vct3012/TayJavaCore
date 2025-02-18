import java.util.Scanner;

public class SoLonNhat {
    public static void main(String[] args) {
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("nhap so thu hai: ");
        int b = scanner.nextInt();
        System.out.println("nhap so thu ba: ");
        int c = scanner.nextInt();


        if (a > b) {
            if (a > c) {
                max = a;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
            System.out.println("so lon nhat la: " + max);
        }

    }
}
