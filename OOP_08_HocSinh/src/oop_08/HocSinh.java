package oop_08;

import java.time.LocalDate;
import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private String lop;
    private LocalDate ngaySinh;
    private double diemToan;
    private double diemVan;
    private double diemAnh;
    private double diemTrungBinh;


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }
    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(){
        diemTrungBinh = (diemVan+diemAnh+diemToan)/3;
    }
    public HocSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("nhap lop: ");
        lop = sc.nextLine();
        System.out.println("nhap ngay sinh: ");
        ngaySinh = LocalDate.parse(sc.nextLine());
        System.out.println("nhap diem toan: ");
        diemToan = sc.nextDouble();
        System.out.println("nhap diem van: ");
        diemVan = sc.nextDouble();
        System.out.println("nhap diem anh: ");
        diemAnh = sc.nextDouble();
    }

    public HocSinh(String hoTen, String lop, LocalDate ngaySinh, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }
    public void inThongTin(){
        setDiemTrungBinh();
        System.out.println(hoTen + " hoc lop "+ lop +", co diem trung binh la "+ diemTrungBinh);
    }
}
