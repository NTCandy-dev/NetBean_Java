
package hdt04;

import java.util.ArrayList;
import java.util.Scanner;


public class Caodang extends Sinhvien{
    private int SMH = 3;
    so n = new so();
    private ArrayList<MonHoc> diemnghe = new ArrayList<MonHoc>();
            
    
    public Caodang(String name, int yeardate, String job, int id){
        super(name, yeardate, job, id);
    }
      public ArrayList<MonHoc> getDiemnghe() {
        return diemnghe;
    }
    public void setDiemnghe(ArrayList<MonHoc>diemnghe) {
        this.diemnghe = diemnghe;
    }
    
    
    public void nhapDiemnghe(Scanner sc){
         for (int i = 0; i < SMH; i++) {
            System.out.print("Nhap ten mon [" + (i + 1) + "]: ");
            String tenMonHoc =n.NhapStirng("");
            double[] diem = new double [3];
            int[] heSo = new int [3];
            for(int j =0; j<3; j++){
                System.out.print("Nhap he so cho mon "+tenMonHoc+": ");
                heSo[j] = n.NhapInt("");
                System.out.print("Nhap diem mon "+tenMonHoc+": ");
                diem[j] = n.NhapFLoat("");
                if(j==2){
                System.out.println("=========================");
            }
            }
            diemnghe.add(new MonHoc(tenMonHoc,diem,heSo));
         }
    }

    public void xuatDiemnghe(){
        for (MonHoc mon : diemnghe) {
            System.out.println(mon);
        }
    }
}
