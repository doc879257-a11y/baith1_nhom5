import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi (VNĐ): ");
        double soTienGui = sc.nextDouble();

        System.out.print("Nhập lãi suất hàng năm (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhập số tháng gửi: ");
        int soThang = sc.nextInt();

        double laiSuatThang = laiSuatNam / 12 / 100;
        double tienLai = soTienGui * laiSuatThang * soThang;
        double tongTien = soTienGui + tienLai;

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Tiền lãi: " + tienLai + " VNĐ");
        System.out.println("Tổng gốc + lãi cuối kỳ: " + tongTien + " VNĐ");


    }
}
