package oop_03;

import java.util.Scanner;

public class MonAn {
    private String tenMonAn;
    private int giaBan;
    private String gioiThieu;
    private String nguyenLieuChinh;

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public String getNguyenLieuChinh() {
        return nguyenLieuChinh;
    }

    public void setNguyenLieuChinh(String nguyenLieuChinh) {
        this.nguyenLieuChinh = nguyenLieuChinh;
    }

    public MonAn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten mon an: ");
        tenMonAn = sc.nextLine();
        System.out.println("nhap gia ban: ");
        giaBan = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap gioi thieu: ");
        gioiThieu = sc.nextLine();
        System.out.println("nhap nguyen lieu chinh");
        nguyenLieuChinh = sc.nextLine();
    }
    public void inThongTin(){
        System.out.println("Mon "+tenMonAn + ", "+ gioiThieu + ", duoc lam tu cac nguyen lieu chinh "+ nguyenLieuChinh);
    }
}
