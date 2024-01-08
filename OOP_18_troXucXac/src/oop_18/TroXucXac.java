package oop_18;

import java.util.Random;
import java.util.Scanner;

public class TroXucXac {
    private int giaTri1;
    private int giaTri2;
    private  boolean thang ;
    private  boolean thua ;
    private  boolean hoa ;

    public int getGiaTri1() {
        return giaTri1;
    }

    public void setGiaTri1(int giaTri1) {
        this.giaTri1 = giaTri1;
    }

    public int getGiaTri2() {
        return giaTri2;
    }

    public void setGiaTri2(int giaTri2) {
        this.giaTri2 = giaTri2;
        if (giaTri2 < giaTri1) {
            thang = true;
        }
        else if (giaTri2 > giaTri1){
            thua = true;
        }
        else hoa =true;
    }

    public boolean isThang() {
        return thang;
    }

    public boolean isThua() {
        return thua;
    }

    public boolean isHoa() {
        return hoa;
    }
    private Scanner sc = new Scanner(System.in);
    private int nhapGiaTri(){
        boolean check = false;
        int n = 0;
        while (!check){
            try{
                System.out.println("nhap gia tri muon cuoc");
                n = sc.nextInt();
                check = true;
            } catch (Exception e){
                System.out.println("nhap so nguyen");
            }
        }
        return n;
    }
    private void inThongTin(){
        if (thang) System.out.println("nguoi dung thang");
        else if (thua) System.out.println("nguoi dung thua");
        else System.out.println("hoa");
    }
    public void batDau(){
        do{
            setGiaTri1(nhapGiaTri());
            if (getGiaTri1() < 3 || getGiaTri1() > 18) {
                System.out.println("ket thuc");
                break;
            }
            Random random =new Random();
            int l1 = random.nextInt(6) + 1;
            int l2 = random.nextInt(6) + 1;
            int l3 = random.nextInt(6) + 1;
            setGiaTri2(l1 + l2 + l3);
            System.out.println("ket qua: " + (l1 + l2 +l3));
            inThongTin();
            thang = thua = hoa = false;
        }while (giaTri2 >= 3 && giaTri2 <= 18);
    }
}
