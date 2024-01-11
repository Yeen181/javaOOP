package view;

import controller.SanPhamController;
import model.SanPham;

import java.util.Scanner;

public class SanPhamView {
    public Scanner sc = new Scanner(System.in);
    SanPhamController sanPhamController = new SanPhamController();
    public void menu(){
        System.out.println(" 1. Thêm Sản Phẩm");
        System.out.println(" 2. Hiện Sản Phẩm Của Loại");
        System.out.println(" 3. Hiển Sản Phẩm Của Nhà Cung Cấp");
        System.out.println(" 4. Them nha cung cap");
        System.out.println(" 5. Them loai san pham");
        System.out.println(" 6. Thoát");
    }
    public void thucThi(char choose){
        switch (choose){
            case '1':
                sanPhamController.themSP();
                break;
            case '2':
                sanPhamController.hienLoai();
                break;
            case '3':
                sanPhamController.errorTypeHienNCC();
                break;
            case '4':
                sanPhamController.themNCC(); break;
            case '5':
                sanPhamController.themLoaiSP();break;
            case '6':
                System.exit(0);
                break;
            default:
                System.out.println("vui long nhap lai trong khoang (1-4)");
        }
    }

}
