package model;

import java.util.Scanner;

public class MonHoc {
    private int maMH;
    private String tenMH;
    private int soTiet;

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getsoTiet() {
        return soTiet;
    }

    public void setsoTiet(int soTiet) {
        this.soTiet = soTiet;
    }
    private Scanner sc = new Scanner(System.in);
    public MonHoc() {
        System.out.println("nhap ma mon hoc");
        maMH = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten mon hoc");
        tenMH = sc.nextLine();
        System.out.println("nhap so tiet");
        soTiet = sc.nextInt();

    }

    public void inThongTin(){
        System.out.println(maMH + " mon " + tenMH + " co " + soTiet + "tiet");
    }
}
