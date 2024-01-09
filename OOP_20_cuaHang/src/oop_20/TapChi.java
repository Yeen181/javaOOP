package oop_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TapChi extends TaiLieu{
    private String tenTapchi;
    private int soPhatHanh, thangPhatHanh;

    public String getTenTapchi() {
        return tenTapchi;
    }

    public void setTenTapchi(String tenTapchi) {
        this.tenTapchi = tenTapchi;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    private Scanner sc = new Scanner(System.in);
    public void nhapTapChi(){
        nhap();
        System.out.println("nhap ten tap chi");
        setTenTapchi(sc.nextLine());
        System.out.println("nhap so phat hanh");
        setSoBanPhatHanh(sc.nextInt());
        System.out.println("nhap so trang");
        setThangPhatHanh(sc.nextInt());
    }
    public void inTapChi(){
        in();
        System.out.println("tap chi " + tenTapchi + " phat hanh so " + soPhatHanh + " vao thang " + thangPhatHanh );
    }
    public static List<TapChi> timKiemSach(List<TapChi> lst, String ten){
        List<TapChi> list = new ArrayList<>();
        lst.forEach(x-> {
            if (x.getTenTapchi().contains(ten)) {
                list.add(x);
            }
        });
        return list;
    }
}
