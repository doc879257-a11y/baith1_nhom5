import java.util.Scanner;
public class Info {
    public static void main(String Args[]) {
        Scanner input = new Scanner(System.in);

        String ten;
        int tuoi;
        double chieucao;
        String thichlaptrinh;

        System.out.print(" Nhap ten");
        ten = input.nextLine(); 
        System.out.print(" Nhap tuoi");
        tuoi = input.nextInt();
        System.out.print("Nhap chieu cao (m)");
        chieucao = input.nextDouble();
        input.nextLine();
        System.out.println("Ban co thich lap trinh khong ?:(co/khong)");
        thichlaptrinh = input.nextLine();

        System.out.println("\n Thong tin ban vua nhap");
        System.out.println("Ten"+ ten);
        System.out.println("Tuoi"+ tuoi);
        System.out.println("Chieucao"+ chieucao);
        System.out.println("Thichlaptrinh"+ thichlaptrinh );

        if(thichlaptrinh.equalsIgnoreCase("co")) {
            System.out.println("Tuyet voi,lap trinh la mot ky nang thu vi.");
        } else {
            System.out.println("Khong sao, co the ban se thich sau nay.");
        }
        input.close();
    }
}    

