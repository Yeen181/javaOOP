package model;

public class NhaCungCap {
    private int nhaCC, soDT;
    private String tenNCC;

    public int getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(int nhaCC) {
        this.nhaCC = nhaCC;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public NhaCungCap() {
        nhaCC = Input.inputInt("nhap nha cc");
        tenNCC = Input.inputString("nhap ten nha cc");
        soDT = Input.inputInt("nhap so dt");

    }

    public void inThongTin(){
        System.out.println("nha cung cap: "+ nhaCC);
        System.out.println("ten nha cung cap:" + tenNCC);
        System.out.println("so dt: " + soDT);
    }
}
