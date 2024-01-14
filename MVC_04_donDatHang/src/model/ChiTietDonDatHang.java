package model;

public class ChiTietDonDatHang {
    private int id, maDDH, maSP, soLuong;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(int maDDH) {
        this.maDDH = maDDH;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public ChiTietDonDatHang() {
        id = Input.inputInt("nhap id");
        maDDH = Input.inputInt("nhap ma don dat hang");
        maSP = Input.inputInt("nhap ma san pham");
        soLuong = Input.inputInt("nhap so luong");
    }

    public void inThongTin(){
        System.out.println("id: " + id);
        System.out.println("ma don dat hang: " + maDDH);
        System.out.println("ma san pham: "+ maSP);
        System.out.println("so luong: " + soLuong);
    }
}
