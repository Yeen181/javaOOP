package view;

import controller.DiemController;
import model.HocSinh;
import model.MonHoc;

import java.util.Scanner;

public class Menu {
    public Scanner sc = new Scanner(System.in);
    DiemController diemController = new DiemController();
    public void menu(){
        System.out.println("1. Thêm Học Sinh");
        System.out.println("2. Thêm Môn Học");
        System.out.println("3. Chấm Điểm");
        System.out.println("4. Xem Bảng Điểm Học Sinh");
        System.out.println("5. Xem Tổng Kết Điểm Học Sinh Theo Môn");
        System.out.println("6. Thoát");
    }
    public void thucThi(char choose){
        switch (choose){
            case '1':
                diemController.themHS(new HocSinh());
                break;
            case '2':
                diemController.themMonHoc(new MonHoc());break;
            case '3':
                diemController.chamDiem();break;
            case '4':
                diemController.bangDiem();break;
            case '5':
                diemController.tongKetMon();break;
            case '6':
                System.exit(0);
                break;
            default:
                System.out.println("vui long nhap lai tu (1-6)");
        }
    }
}
