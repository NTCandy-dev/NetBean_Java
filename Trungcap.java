
package hdt04;

import java.util.ArrayList;
import java.util.Scanner;


public class Trungcap extends Sinhvien{
    private int SMH = 3;
    so n = new so();
    ArrayList<MonHoc> diemnghe = new ArrayList<MonHoc>();
    ArrayList<MonHoc> diemmonXH = new ArrayList<MonHoc>();
    ArrayList<MonHoc> diemmonTN = new ArrayList<MonHoc>();
    
    
    public Trungcap(String name, int yeardate,String job,int id){
        super(name,yeardate,job,id);
    }

    public ArrayList<MonHoc> getDiemnghe() {
        return diemnghe;
    }

    public void setDiemnghe(ArrayList<MonHoc> diemnghe) {
        this.diemnghe = diemnghe;
    }

    public ArrayList<MonHoc> getDiemmonXH() {
        return diemmonXH;
    }

    public void setDiemmonXH(ArrayList<MonHoc> diemmonXH) {
        this.diemmonXH = diemmonXH;
    }

    public ArrayList<MonHoc> getDiemmonTN() {
        return diemmonTN;
    }

    public void setDiemmonTN(ArrayList<MonHoc> diemmonTN) {
        this.diemmonTN = diemmonTN;
    }
    
    
double[] diem = new double[3];
int[] heSo = new int[3];
    
    public void nhapDiemnghe(Scanner sc){
        for(int i=0; i<SMH; i++){
            System.out.print("Nhap ten mon ["+(i+1)+"]: ");
            String tenMonHoc = n.NhapStirng("");
            
            for(int j=0; j<3; j++){
                System.out.print("Nhap he so cho mon "+tenMonHoc+": ");
                heSo[j]=n.NhapInt("");
                System.out.print("Nhap diem mon "+tenMonHoc+": ");
                diem[j]= n.NhapFLoat("");
                
                 if(j==2){
                System.out.println("===============");
            }
            }
            diemnghe.add(new MonHoc(tenMonHoc,diem,heSo));
        }
    }
    
    public void nhapDiemXH(Scanner sc){
        for(int i=0; i<SMH; i++){
            System.out.print("Nhap ten mon XH["+(i+1)+"]: ");
            String tenMonHoc = n.NhapStirng("");
            
            for(int j=0; j<3; j++){
               System.out.print("Nhap he so cho mon "+tenMonHoc+": ");
                heSo[j]=n.NhapInt("");
                System.out.print("Nhap diem mon "+tenMonHoc+": ");
                diem[j]= n.NhapFLoat("");
                
                 if(j==2){
                System.out.println("===============");
            }
            }
            diemmonXH.add(new MonHoc(tenMonHoc,diem,heSo));
        }
    }
    
    public void nhapDiemTN(Scanner sc){
        for(int i =0; i<SMH; i++){
            System.out.print("Nhap ten mon TN ["+(i+1)+"]: ");
            String tenMonHoc = n.NhapStirng("");
            
           for(int j=0; j<3; j++){
                System.out.print("Nhap he so cho mon "+tenMonHoc+": ");
                heSo[j]=n.NhapInt("");
                System.out.print("Nhap diem mon "+tenMonHoc+": ");
                diem[j]= n.NhapFLoat("");
                 if(j==2){
                System.out.println("===============");
            }
            }
            diemmonTN.add(new MonHoc(tenMonHoc,diem,heSo));
        }
    }
    
    public void xuatDiem(){
        System.out.println("DTB mon chuyen nganh");
        for (MonHoc mon : diemnghe) {
            System.out.println(mon);
        }
         System.out.println("DTB mon TN");
        for (MonHoc mon : diemmonXH) {
            System.out.println(mon);
        }
        System.out.println("DTB mon XH");
         for (MonHoc mon : diemmonTN) {
            System.out.println(mon);
        }
    }
}
