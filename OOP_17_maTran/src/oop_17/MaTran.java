package oop_17;

import java.util.Scanner;

public class MaTran {
    private int soHang;
    private int soCot;
    private int [][] matrix = new int[100][100];

    public int getSoHang() {
        return soHang;
    }

    public void setSoHang(int soHang) {
        this.soHang = soHang;
    }

    public int getSoCot() {
        return soCot;
    }

    public void setSoCot(int soCot) {
        this.soCot = soCot;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    private Scanner sc = new Scanner(System.in);
    public MaTran() {
        System.out.println("nhap so hang");
        soHang = sc.nextInt();
        System.out.println("nhap so cot");
        soCot = sc.nextInt();
        setMatrix(nhapMaTran(matrix, soHang, soCot));;
    }
    public int [][] nhapMaTran(int [][] matrix, int soHang,int soCot){
        System.out.println("nhap ma tran");
        for (int i = 0; i < soHang; i++){
            for (int j = 0; j < soCot; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public MaTran(int soHang, int soCot, int[][] matrix) {
        this.soHang = soHang;
        this.soCot = soCot;
        this.matrix = matrix;
    }
    public MaTran cong(MaTran mt){
        if (soCot!= mt.getSoCot() || soHang != mt.getSoHang()) {
            System.out.println("khong thoa man");
            return null;
        }
        MaTran reuslt = new MaTran(soHang,soCot,new int[soHang][soCot]);
        for (int i = 0; i < soHang; i++){
            for (int j = 0; j< soCot; j++){
                reuslt.matrix[i][j] = matrix[i][j] + mt.matrix[i][j];
            }
        }
        return reuslt;
    }
    public void inThongTin(){
        for (int i = 0; i < soHang; i++){
            for (int j = 0 ;j < soCot; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
