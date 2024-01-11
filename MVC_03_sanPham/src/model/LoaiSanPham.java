package model;

public class LoaiSanPham {
    private int loaiSP;
    private String tenLoai;

    public int getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(int loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiSanPham() {
        loaiSP = Input.inputInt("nhap loai sp");
        tenLoai = Input.inputString("nhap ten loai");
    }

    public void inThongTin(){
        System.out.println("Loai san pham: "+ loaiSP);
        System.out.println("ten loai: " + tenLoai);
    }
}
