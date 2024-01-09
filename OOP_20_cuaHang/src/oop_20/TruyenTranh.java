package oop_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruyenTranh extends TaiLieu{
    private String tenTruyen;
    private int ngayPhatHanh;

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    private Scanner sc = new Scanner(System.in);
    public void nhapTruyenTranh(){
        System.out.println("nhap ten truyen tranh");
        setTenTruyen(sc.nextLine());
        System.out.println("nhap ngay phat hanh");
        setNgayPhatHanh(sc.nextInt());
    }
    public void inTruyenTranh(){
        in();
        System.out.println("truyen " + tenTruyen + " phat hanh ngay " + ngayPhatHanh);
    }
    public static List<TruyenTranh> timKiemSach(List<TruyenTranh> lst, String ten){
        List<TruyenTranh> list = new ArrayList<>();
        lst.forEach(x-> {
            if (x.getTenTruyen().contains(ten)) {
                list.add(x);
            }
        });
        return list;
    }
}
