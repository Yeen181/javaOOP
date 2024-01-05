package oop_05;

import java.util.Scanner;

public class NhanVien {
    private int maNhanVien;
    private String hoVaTen;
    private String phongBan;
    private String diaChi;
    private String soDienThoai;

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    private Scanner sc = new Scanner(System.in);
    public NhanVien(){
        System.out.println("nhap ma nhan vien");
        maNhanVien = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ho va ten");
        hoVaTen = sc.nextLine();
        System.out.println("nhap phong ban");
        phongBan = sc.nextLine();
        System.out.println("nhap dia chi");
        diaChi = sc.nextLine();
        System.out.println("nhap so dien thoai");
        soDienThoai = sc.nextLine();
    }
    public void inThongTin(){
        System.out.println("Nhan vien " + hoVaTen + " thuoc phong ban " + phongBan + " co so dien thoai la " + soDienThoai);
    }
}
