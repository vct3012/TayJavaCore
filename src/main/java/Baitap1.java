import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số bất kỳ: ");
        String input = scanner.nextLine(); // Đọc dữ liệu dưới dạng chuỗi

        try {
            double number = Double.parseDouble(input); // Chuyển đổi chuỗi sang số thực

            if (number > 0) {
                System.out.println("Số này là số dương.");
            } else if (number < 0) {
                System.out.println("Số này là số âm.");
            } else {
                System.out.println("Số này là số 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Đây không phải số.");
        }

        scanner.close(); // Đóng Scanner để tránh rò rỉ tài nguyên
    }
}
