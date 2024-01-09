package oop_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenSach, tenTacGia;
    private int soTrang;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    private Scanner sc = new Scanner(System.in);
    public void nhapSach(){
        nhap();
        System.out.println("nhap ten sach");
        setTenSach(sc.nextLine());
        System.out.println("nhap ten tac gia");
        setTenTacGia(sc.nextLine());
        System.out.println("nhap so trang");
        setSoTrang(sc.nextInt());
    }
    public void inSach(){
        in();
        System.out.println("sach " + tenSach + " do " + tenTacGia + " viet co " + soTrang + " trang");
    }
    public static List<Sach> timKiemSach(List<Sach> lst, String ten){
        List<Sach> list = new ArrayList<>();
        lst.forEach(x-> {
            if (x.getTenSach().contains(ten)) {
                list.add(x);
            }
        });
        return list;
    }
}
