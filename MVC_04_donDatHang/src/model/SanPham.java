package model;

import java.util.Scanner;


public class SanPham {
    private int maSP;
    private String tenSP;
    private double giaBan;
    private String ghiChu;

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    private Scanner sc = new Scanner(System.in);
    public SanPham() {
        maSP = Input.inputInt("nhap ma san pham");
        tenSP = Input.inputString("nhap ten san pham");
        giaBan = Input.inputDouble("nhap gia ban");
        ghiChu = Input.inputString("nhap ghi chu");
    }
    public void inThongTin(){
        System.out.println("ma sp: " + maSP);
        System.out.println("ten sp: " + tenSP);
        System.out.println("gia ban: " + giaBan);
        System.out.println("ghi chu: " + ghiChu);

    }
}
