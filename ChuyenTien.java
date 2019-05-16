package season1.ChuyenDoiTienTe;

import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap menh gia USD: ");
        int usd = sc.nextInt();
        int vnd = usd*23000;
        System.out.printf("Menh gia da duoc chuyen la: "+vnd);

    }
}
