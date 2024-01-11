package controller;


import model.SoHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoHocController {
    List<SoHoc> danhSachSoHoc = new ArrayList<>();

    public void taoNgauNhien(int n){
        Random random =  new Random();
        for (int i = 0; i < n; i++){
            int giaTri = random.nextInt(100);
            danhSachSoHoc.add(new SoHoc(giaTri));
        }
    }
    public void hienThiTatCa(){
        for (SoHoc soHoc : danhSachSoHoc){
            soHoc.inThongTin();
        }
    }
    public void hienThiChan(boolean dk){
        for (SoHoc soHoc : danhSachSoHoc){
            if (dk == soHoc.isLaSoChan()){
                soHoc.inThongTin();
            }
        }
    }
    public void hienThiSoNT(boolean dk){
        for (SoHoc soHoc : danhSachSoHoc){
            if (dk == soHoc.isLaSoNT()){
                soHoc.inThongTin();
            }
        }
    }
    public void hienThiDoiXung(boolean dk){
        for (SoHoc soHoc : danhSachSoHoc){
            if (dk == soHoc.isLaSoDoiXung()){
                soHoc.inThongTin();
            }
        }
    }
}
