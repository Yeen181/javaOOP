package oop_14;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo(int tu, int mau) {
        setTuSo(tu);
        setMauSo(mau);
    }
    private PhanSo ToiGian(){
        if (mauSo == 0) return null;
        int tu = tuSo, mau = mauSo;
        while (Math.abs(tu) !=  Math.abs(mau)){
            if (Math.abs(tu) > Math.abs(mau)) tu = Math.abs(tu) - Math.abs(mau);
            else mau = Math.abs(mau) - Math.abs(tu);
        }
        return new PhanSo(tuSo/tu, mauSo/mau);
    }
    public PhanSo Cong(PhanSo ps){
        return (new PhanSo(tuSo*ps.getMauSo() + ps.getTuSo()*mauSo, mauSo*ps.getMauSo())).ToiGian();
    }
    public PhanSo Tru(PhanSo ps){
        return (new PhanSo(tuSo*ps.getMauSo() - ps.getTuSo()*mauSo, mauSo*ps.getMauSo())).ToiGian();
    }
    public PhanSo(){
        Scanner sc = new Scanner(System.in);
        setTuSo(sc.nextInt());
        setMauSo(sc.nextInt());
    }
    public void InThongTin(){
        System.out.println(tuSo +"/"+mauSo);
    }
}
