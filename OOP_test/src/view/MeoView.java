package view;

import controller.MeoController;
import model.Meo;
import model.TiengKeu;
import model.TiengKeuMeoAnhLongNgan;
import model.TiengKeuMeoLongDai;

import java.util.Scanner;

public class MeoView {
    Scanner sc = new Scanner(System.in);
    MeoController controller = new MeoController();
    public void menu(){
        System.out.println("1.Thêm mèo");
        System.out.println("2.Xóa Mèo theo ID");
        System.out.println("3.Hiển thị toàn bộ mèo");
        System.out.println("4.Hiển thị mèo theo ID");
        System.out.println("5.Thay đổi tiếng kêu theo ID");
        System.out.println("6.Thoát chương trình");
        System.out.println("vui long nhap su lua chon tư (1-6)");
    }
    public void thucThi(char choose){
        switch (choose){
            case '1':
                Meo meo = new Meo() {
                    @Override
                    public void hienThiThongTin() {
                        System.out.println("id: " + getId());
                        System.out.println("ten meo: " + getTenMeo());
                        System.out.println("tuoi meo: " + getTuoi());
                        System.out.println("gioi tinh: " + getGioiTinh());
                    }
                };
                controller.themMeo(meo);
                break;
            case '2':
                System.out.println("nhap id meo can xoa:");
                int idCanXoa = sc.nextInt();
                controller.xoaMeoTheoID(idCanXoa);
                break;
            case '3':
                controller.hienThiToanBoMeo();
                break;
            case '4':
                System.out.println("nhap id meo muon hien thi: ");
                int idMeo = sc.nextInt();
                controller.hienThiMeoTheoID(idMeo);
                break;
            case '5':
                System.out.println("nhap id meo can thay doi tieng keu");
                int id = sc.nextInt();
                System.out.println("chon tieng keu moi cho meo");
                System.out.println("1.Meo anh long dai");
                System.out.println("2.Meo anh long ngan");
                int chonMeo = sc.nextInt();
                TiengKeu tiengKeuMoi = chonKeu(chonMeo);
                controller.thayDoiTiengKeuTheoID(id, tiengKeuMoi);
                break;
            case '6':
                System.exit(0);
                break;
            default:
                System.out.println("nhap khong hop le");

        }
    }
    public TiengKeu chonKeu(int id){
        switch (id){
            case 1:
                return new TiengKeuMeoLongDai();
            case 2:
                return new TiengKeuMeoAnhLongNgan();
            default:
                System.out.println("mac dinh meo anh long dai");
                return new TiengKeuMeoLongDai();
        }
    }
}
