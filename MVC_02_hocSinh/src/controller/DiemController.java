package controller;

import model.Diem;
import model.HocSinh;
import model.MonHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiemController {
    List<Diem> lstDiem = new ArrayList<>();
    List<HocSinh> lstHocSinh = new ArrayList<>();
    List<MonHoc> lstMonHoc = new ArrayList<>();
    public void themHS(HocSinh hs){
        lstHocSinh.add(hs);
    }
    public void themMonHoc(MonHoc mh ){
       lstMonHoc.add(mh);
    }
    public void themDiem(Diem diem){
        lstDiem.add(diem);
    }
    public void chamDiem(){
        Diem diem = new Diem();
        Diem diemHienTai = timDiem(diem.getMaHS(), diem.getMaMH());
        if (diemHienTai != null){
            diemHienTai = new Diem(diem.getMaMH(),diem.getMaMH(),diem.getDiem());
        }
        else {
            themDiem(diem);
        }

    }
    private Diem timDiem(int maHS, int maMH){
        for (Diem diem : lstDiem){
            if (diem.getMaHS() == maHS && diem.getMaMH() == maMH){
                return diem;
            }
        }
        return null;
    }
    private Scanner sc = new Scanner(System.in);
    public void bangDiem(){
        System.out.println("nhap ma hs");
        int maHS = sc.nextInt();
      for (Diem diem : lstDiem){
          if (diem.getMaHS() == maHS){
              diem.inThongTin();
          }
      }
    }
    public void tongKetMon(){
        System.out.println("nhap ma mon hoc");
        int maMH = sc.nextInt();
        for (Diem diem : lstDiem){
            if (diem.getMaMH() == maMH){
                diem.inThongTin();
            }
        }
    }
}
