package model;

import java.util.Scanner;

public class SoHoc {
    private int giaTri;
    private boolean laSoChan, laSoNT, laSoDoiXung;

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
        laSoChan = kiemTraChan();
        laSoNT = kiemTraNT();
        laSoDoiXung = kiemTraSoDoiXung();
    }

    public boolean isLaSoChan() {
        setGiaTri(giaTri);
        return laSoChan;
    }

    public boolean isLaSoNT() {
        setGiaTri(giaTri);
        return laSoNT;
    }

    public boolean isLaSoDoiXung() {
        setGiaTri(giaTri);
        return laSoDoiXung;
    }
    private boolean kiemTraChan(){
        if (giaTri % 2 == 0) return true;
        else return false;
    }
    private boolean kiemTraNT(){
        for (int i = 2; i <= Math.sqrt(giaTri); i++){
            if (giaTri % i == 0) return false;
        }
        return true;
    }
    private boolean kiemTraSoDoiXung(){
        char [] a = String.valueOf(giaTri).toCharArray();
        for (int i = 0; i < a.length-1;i++){
            if(a[i] != a[a.length - 1 - i]) return false;
        }
        return true;
    }
    public SoHoc(int giaTri) {
        setGiaTri(giaTri);
    }
//    private Scanner sc = new Scanner(System.in);
//    public SoHoc(){
//        System.out.println("nhap gia tri");
//        setGiaTri(sc.nextInt());
//    }
    public void inThongTin(){
        System.out.println("so " + getGiaTri() + " " + laSoChan + " la so chan "+ laSoNT + " la so NT "+ laSoDoiXung + " la so doi xung");
    }
}
