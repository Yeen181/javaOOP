package view;

import controller.SoHocController;
import model.SoHoc;

import java.util.Scanner;

public class SoHocView {
    public Scanner sc = new Scanner(System.in);
    private SoHocController controller = new SoHocController();

    public void menu(){
        System.out.println("1.Tao so");
        System.out.println("2. Hiển thị Tất Cả");
        System.out.println("3. Hiển thị Số Chẵn");
        System.out.println("4. Hiển thị Số Lẻ");
        System.out.println("5. Hiển thị số Nguyên Tố");
        System.out.println("6. Hiển thị số Đối Xứng");
        System.out.println("7. Thoát");
        System.out.println("chon chuc nang tu (1-7)");
    }
    public void thucThi(char choose){
        switch (choose){
            case '1':
                System.out.println("nhap so n: ");
                int n = sc.nextInt();
                controller.taoNgauNhien(n);
                break;
            case '2':
                controller.hienThiTatCa();break;
            case '3':
                controller.hienThiChan(true); break;
            case '4':
                controller.hienThiChan(false); break;
            case '5':
                controller.hienThiSoNT(true); break;
            case '6':
                controller.hienThiDoiXung(true);break;
            case '7':
                System.exit(0);
                break;
            default:
                System.out.println("nhap khong hop le");
        }
    }
}
