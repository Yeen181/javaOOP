package oop_20;

import java.util.Scanner;

public class TaiLieu {
    private int maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    private Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("nhap ma tai lieu");
        setMaTaiLieu(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten nha xuat ban");
        setTenNhaXuatBan(sc.nextLine());
        System.out.println("nhap so ban phat hanh");
        setSoBanPhatHanh(sc.nextInt());
    }
    public void in(){
        System.out.print("tai lieu co ma "+ maTaiLieu + " do " + tenNhaXuatBan + " xuat ban, co "+ soBanPhatHanh + " ban phat hanh, ");
    }
}
