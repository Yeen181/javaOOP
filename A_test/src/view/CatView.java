package view;

import controller.CatController;
import lib.Input;

import java.util.Scanner;

public class CatView {
    Scanner sc = new Scanner(System.in);
    CatController controller = new CatController();
    public void menu(){
        System.out.println("1.Thêm mèo");
        System.out.println("2.Xóa Mèo theo ID");
        System.out.println("3.Hiển thị toàn bộ mèo");
        System.out.println("4.Hiển thị mèo theo ID");
        System.out.println("5.Thay đổi tiếng kêu theo ID");
        System.out.println("6.Thoát chương trình");
        System.out.println("vui long nhap su lua chon tư (1-6)");
    }
    public void thucThi(int choose){
        switch (choose){
            case 1:
                controller.themMeo();
                break;
            case 2:
                int id = Input.inputInt("nhap id meo can xoa");
                controller.xoaMeo(id);
                break;
            case 3:
                controller.hienThiToanBoMeo();
                break;
            case 4:
                int id1 = Input.inputInt("nhap id meo can hien thi");
                controller.hienThiMeoTheoId(id1);
                break;
            case 5:
                int id2 = Input.inputInt("nhap id meo can thay doi ten:");
                controller.thaydoiKeu(id2);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("khong hop le");
        }
    }
}
