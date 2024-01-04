package oop_07;

import java.time.LocalDate;
import java.util.Scanner;

public class Sach {
    private String tenSach;
    private String theLoaiSach;
    private int gia;
    private LocalDate ngayXuatBan;
    private String tacGia;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoaiSach() {
        return theLoaiSach;
    }

    public void setTheLoaiSach(String theLoaiSach) {
        this.theLoaiSach = theLoaiSach;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public LocalDate getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(LocalDate ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    private Scanner sc = new Scanner(System.in);
    public Sach() {
        System.out.println("nhap ten sach");
        tenSach = sc.nextLine();
        System.out.println("nhap the loai");
        theLoaiSach = sc.nextLine();
        System.out.println("nhap gia");
        gia = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ngay xuat ban");
        ngayXuatBan = LocalDate.parse(sc.nextLine());
        System.out.println("nhap tac gia");
        tacGia = sc.nextLine();
    }
    public void InThongTin(){
        System.out.println(tenSach + " la sach " + theLoaiSach + " co gia "+ gia+ " xuat ban ngay "+ ngayXuatBan + " viet boi " + tacGia);
    }
}
