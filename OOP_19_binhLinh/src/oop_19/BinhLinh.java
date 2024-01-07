package oop_19;

public class BinhLinh {
    protected String ten;
    protected int sucManh;
    protected boolean trangBi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSucManh() {
        tinhSucManh();
        return sucManh;
    }

    public boolean isTrangBi() {
        return trangBi;
    }

    public void setTrangBi(boolean trangBi) {
        this.trangBi = trangBi;
    }
    protected double tinhSucManh(){
        if (trangBi == true) {
            return sucManh *= 1.1;
        }
        else return sucManh;
    }
    public void chienDau(BinhLinh bl){
        if(sucManh > bl.getSucManh()) System.out.println(ten + " chien thang");
        else if(sucManh < bl.getSucManh()) System.out.println(bl.getTen() + " chien thang");
        else System.out.println(ten + bl.getTen() + "hoa nhau");

    }

    public BinhLinh(String ten, int sucManh, boolean trangBi) {
        this.ten = ten;
        this.sucManh = sucManh;
        this.trangBi = trangBi;
    }


    public void inThongTin(){
        System.out.println(ten + " co chi so suc manh " + getSucManh());
    }
}
