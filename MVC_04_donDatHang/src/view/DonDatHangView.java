package view;

import controller.DonDatHangController;
import model.ChiTietDonDatHang;
import model.Input;

public class DonDatHangView {
    DonDatHangController controller = new DonDatHangController();
    public void menu(){
        System.out.println("1. Thêm đơn hàng");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("3. Thêm chi tiết đơn hàng");
        System.out.println("4. Hiển thị thông tin đơn hàng");
        System.out.println("5. Thoát");
        System.out.println("vui long chon trong khoang (1-5)");
    }
    public void thucThi(char choose){
        switch (choose){
            case '1':
                controller.themDonDatHang();
                break;
            case '2':
                controller.themSanPham();
                break;
            case '3':
                controller.themChiTietDonDatHang(new ChiTietDonDatHang());
                break;
            case '4':
                int maDDH = Input.inputInt("nhap ma DDH: ");
                controller.hienThiDon(maDDH);
                break;
            case '5':
                System.exit(0);
                break;
            default:
                System.out.println("vui long nhap lai");
        }
    }
}
