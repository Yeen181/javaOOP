package model;

import java.time.LocalDate;
import java.util.Scanner;

public class DonDatHang {
    private int maDDh;
    private String soHieuDon;
    private LocalDate ngayTao;

    public int getMaDDh() {
        return maDDh;
    }

    public void setMaDDh(int maDDh) {
        this.maDDh = maDDh;
    }

    public String getSoHieuDon() {
        return soHieuDon;
    }

    public void setSoHieuDon(String soHieuDon) {
        this.soHieuDon = soHieuDon;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public DonDatHang() {
        maDDh = Input.inputInt("nhap ma ddh");
        soHieuDon = Input.inputString("nhap so hieu don");
        System.out.println("nhap ngay tao");
        Scanner sc = new Scanner(System.in);
        ngayTao = LocalDate.parse(sc.nextLine());
    }
    public void inThongTin(){
        System.out.println("ma don dat hang: " + maDDh);
        System.out.println("so hieu don: " + soHieuDon);
        System.out.println("ngay tao: " + ngayTao);
    }
}
