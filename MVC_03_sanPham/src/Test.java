import controller.SanPhamController;
import model.LoaiSanPham;
import model.NhaCungCap;
import view.SanPhamView;

public class Test {
    public static void main(String[] args) {
        SanPhamView sanPhamView = new SanPhamView();
        while (true){
            sanPhamView.menu();
            char choose = sanPhamView.sc.next().charAt(0);
            sanPhamView.thucThi(choose);
        }
    }
}
