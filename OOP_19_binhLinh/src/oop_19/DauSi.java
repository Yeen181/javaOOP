package oop_19;

public class DauSi extends BinhLinh{

    public DauSi(String ten, int sucManh, boolean trangBi) {
        super(ten, sucManh, trangBi);
    }
    protected double tinhSucManh(){
        if (trangBi == true) {
            return sucManh *= 1.5;
        }
        else return sucManh;
    }
}
