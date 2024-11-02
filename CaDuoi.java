/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayca;

import java.util.Scanner;

/**
 *
 * @author M14
 */
public class CaDuoi extends Ca{
    private String vung;
    private String tengoikhac;

    private int choose;
    private double tong_choose = 0;
    so_ca n = new so_ca();
    public CaDuoi(String moitruong, String loaida, String xuongsong, String vung, String tengoikhac) {
        super(moitruong, loaida, xuongsong);
        this.vung=vung;
        this.tengoikhac = tengoikhac;
    }
    
    

    public String getVung() {
        return vung;
    }

    public void setVung(String vung) {
        this.vung = vung;
    }

    public String getTengoikhac() {
        return tengoikhac;
    }

    public void setTengoikhac(String tengoikhac) {
        this.tengoikhac = tengoikhac;
    }

   public void datDiem(){
       System.out.println("=============== Chon dat diem ===============");
       System.out.println("=== 1. Than hinh det vay nguc xoe rong ======");//gai
       System.out.println("=== 2. Duoi dep & ngan, co dom xanh bien ====");//sao
       System.out.println("=== 3. Than hinh to lon, duoi co nhieu gai ==");//doi
       do {           
           System.out.println("Nhap lua chon: ");
           choose = n.NhapInt("");
           if(choose < 1 || choose > 3){
               System.out.println("Chi duoc chon tu 1 den 3");
           }
       } while (choose < 1 || choose > 3);
       switch(choose){
           case 1:
               tong_choose += 13;
               break;
           case 2:
               tong_choose += 22;
               break;
           default:
               tong_choose += 31;
               break;
       }
   }
   
   public void kichThuoc(){
       System.out.println("============== Chon kich thuoc ==============");
       System.out.println("=== 1. 30 den 200cm =========================");//gai
       System.out.println("=== 2. 50 den 60cm ==========================");//sao
       System.out.println("=== 3. 100 den 180cm ========================");//doi
       do {           
           System.out.println("Nhap lua chon: ");
           choose = n.NhapInt("");
           if(choose < 1 || choose > 3){
               System.out.println("Chi duoc chon tu 1 den 3");
           }
       } while (choose < 1 || choose > 3);
       switch(choose){
           case 1:
               tong_choose += 13;
               break;
           case 2:
               tong_choose += 22;
               break;
           default:
               tong_choose += 31;
               break;
       }
   }
   
   public void deXuat(){
       if(tong_choose == 26 ){
           System.out.println("De xuat dua tren lua chon cua ban: Ca duoi Gai");
       }
       else if(tong_choose == 44 ){
           System.out.println("De xuat dua tren lua chon cua ban: Ca duoi Sao");
       }
       else if(tong_choose == 93){
           System.out.println("De xuat dua tren lua chon cua ban: Ca duoi Doi");
       }
       else{
           System.out.println("Khong thay loai ca co cung dat diem !!");
       }
   }

    @Override
    public void nhapCa(){
        Scanner sc = new Scanner(System.in);
        super.nhapCa();
        
        System.out.println("Nhap vung nuoc song: ");
        this.vung = sc.nextLine();
        System.out.println("Nhap ten goi khac: ");
        this.tengoikhac = sc.nextLine(); 
    }
    @Override
    public void xuatCa(){
        super.xuatCa();
        
        System.out.println("Vung nuoc: "+this.vung);
        System.out.println("Ten goi: "+this.tengoikhac);
    }
}
