package oop_13;

import java.util.Scanner;

public class SoNguyen {
    private int giaTri;
    private boolean laSoChan;
    private boolean laSoNguyen;
    private boolean laSoDoiXung;

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
        laSoChan = KiemTraChan();
        laSoNguyen = SoNguyenTo();
        laSoDoiXung = SoDoiXung();
    }

    public boolean isLaSoChan() {
        return laSoChan;
    }


    public boolean isLaSoNguyen() {
        return laSoNguyen;
    }


    public boolean isLaSoDoiXung() {
        return laSoDoiXung;
    }
    private boolean KiemTraChan(){
        if (giaTri % 2 == 0) return true;
        return false;
    }
    private boolean SoNguyenTo(){
        if (giaTri < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(giaTri);i++){
                if (giaTri % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean SoDoiXung(){
        char [] a = String.valueOf(giaTri).toCharArray();
        for (int i = 0; i < a.length-1;i++){
            if(a[i] != a[a.length - 1 - i]) return false;
        }
        return true;
    }

    public SoNguyen(int giaTri) {
        setGiaTri(giaTri);
    }
    private Scanner sc = new Scanner(System.in);
    public SoNguyen(){
        setGiaTri(nhapSo());
    }
    public void Cong(SoNguyen n){
        System.out.println(giaTri + n.getGiaTri());
    }
    public void InThongTin(){

        System.out.println("so " +giaTri+ laSoChan + " la so chan, " + laSoNguyen+" la so nguyen to,"+ laSoDoiXung + " la so doi xung");
    }
    private int nhapSo(){
        boolean check = false;
        int a = 0;
        while (!check){
            try{
                System.out.println("nhap so: " );
                a = sc.nextInt();
                check = true;
            }catch (Exception e){
                System.out.println("vui long nhap lai so");
                sc.nextLine();
            }
        }
        return a;
    }
}
