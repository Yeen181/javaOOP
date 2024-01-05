package oop_15;

import java.util.Scanner;

public class DongHo {
    private int gio;
    private int phut;
    private int giay;
    private boolean laBuoiSang;

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
        if (gio < 12) laBuoiSang = true;
        else laBuoiSang = false;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    public boolean isLaBuoiSang() {
        return laBuoiSang;
    }
    private Scanner sc =  new Scanner(System.in);
    private int nhapSo(String msgNhap, String msgLoi, int min, int max){
        boolean check = false;
        int n = 0;
        while (!check){
            try{
                System.out.println(msgNhap);
                n = sc.nextInt();
                if(n >= min && n <= max) check = true;
            } catch (Exception e){
                System.out.println(msgLoi);
                sc.nextLine();
            }
        }
        return n;
    }

    public DongHo(int gio, int phut, int giay) {
        setGio(gio);
        setPhut(phut);
        setGiay(giay);
    }

    public DongHo() {
        setGio(nhapSo("nhap gio", "nhap lai gio trong khoang [0,23]",0,23));
        setPhut(nhapSo("nhap phut", "nhap lai phut trong khoang [0,59]",0,59));
        setPhut(nhapSo("nhap giay", "nhap lai giay trong khoang [0,59]",0,59));
    }
    public DongHo layKhoangThoiGian(DongHo dh){
        int a = Math.abs(gio * 3600 + phut * 60 + giay - dh.getGio()*3600 - dh.getPhut() * 60 - dh.getGiay());
        return new DongHo(a/3600,(a%3600)/60,(a%3600)%60);
    }
    public void inThongTin(){
        System.out.println(gio + ":" + phut + ":"+ giay +","+ laBuoiSang + " la buoi sang");
    }
}
