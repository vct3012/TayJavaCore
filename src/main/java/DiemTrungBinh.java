import java.sql.SQLOutput;
import java.util.Scanner;

public class DiemTrungBinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem mon Toan: ");
        double toan = input.nextDouble();
        System.out.println("Nhap diem mon Van: ");
        double van = input.nextDouble();
        System.out.println("Nhap diem mon Anh: ");
        double anh = input.nextDouble();

        double dtb = (toan + van + anh) / 3;
        System.out.println("Diem trung binh la: " + Math.round(dtb * 100.0) / 100.0);

        if (dtb >= 8.5) {
            System.out.println("day la hs gioi");
        } else if (dtb < 8.5 && dtb >= 7.5) {
            System.out.println("day la hs kha");
        } else if (dtb < 7.0 && dtb >= 5.0) {
            System.out.println("day la hs trung binh");
        } else if (dtb < 5.0) {
            System.out.println("day la hs yeu");
        }

    }
}
