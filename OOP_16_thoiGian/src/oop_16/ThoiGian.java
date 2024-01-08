package oop_16;

import java.util.Calendar;
import java.util.Scanner;

public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;
    private boolean laNamNhuan;
    Calendar calendar = Calendar.getInstance();
    private int thu;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
        calendar.set(nam, thang - 1, ngay);
        thu = calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
        if(nam % 4 ==0 && nam % 100 != 0 || nam % 400 == 0) laNamNhuan = true;
        else laNamNhuan = false;
    }

    public boolean isLaNamNhuan() {
        return laNamNhuan;
    }

    public int getThu() {
        return thu;
    }
    private Scanner sc = new Scanner(System.in);
    private int nhapso(String msgNhap, String msgLoi, int min, int max){
        boolean check = false;
        int n = 0;
        while (!check){
            try {
                System.out.println(msgNhap);
                n = sc.nextInt();
                if (n >= min && n <= max) check = true;
                else check = false;
            }catch (Exception e){
                System.out.println(msgLoi);
                sc.nextLine();
            }
        }
        return n;
    }
    public ThoiGian(int nam, int thang, int ngay) {
        setNam(nam);
        setThang(thang);
        setNgay(ngay);
    }

    public ThoiGian() {
        setNam(nhapso("nhap nam", "vui long nhap lai so trong khoang [1000 - hien tai]",1000,calendar.get(Calendar.YEAR)));
        setThang(nhapso("nhap thang","vui long nhap so trong khoang [1,12]",1,12));
        if (thang == 2){
            if (laNamNhuan) setNgay(nhapso("nhap ngay", "vui long nhap ngay trong khoang [1,29]",1,29));
            else setNgay(nhapso("nhap ngay", "vui long nhap ngay trong khoang [1,28]",1,28));
        }
        else if (thang == 4 || thang == 6 || thang == 9|| thang ==  11){
            setNgay(nhapso("nhap ngay", "vui long nhap ngay trong khoang [1,30]",1,30));
        }
        else setNgay(nhapso("nhap ngay", "vui long nhap ngay trong khoang [1,31]",1,31));
    }
    public long layKhoangThoiGian(ThoiGian thoiGian){
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(nam,thang -1, ngay);
        calendar2.set(thoiGian.getNam(), thoiGian.getThang() -1 , thoiGian.getNgay());
        long n = (calendar1.getTimeInMillis() - calendar2.getTimeInMillis())/(24*60*60*1000);
        return n;
    }
    public void inThongTin(){
        System.out.println("thu " + thu + " ngay "+ ngay + "/" + thang + "/" + nam + ", " + laNamNhuan + " la nam nhuan");
    }
}
