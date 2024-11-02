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

public class CaTre extends Ca{
    
    private String ho;
    private String vung;
    
    so_ca n = new so_ca();
    private int choose;
    private double tong_choose = 0;
//    private String[]mau;
//    private int chieudai;
//    private String food;
//    private int Khoiluong;
//    private String vung;
//    private String cautao;

    public CaTre(String moitruong, String loaida, String xuongsong, String ho, String vung) {
        super(moitruong, loaida, xuongsong);
        this.ho=ho;
        this.vung=vung;
    }
    
    public void chon(){
        System.out.println("");
    }
   

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getVung() {
        return vung;
    }

    public void setVung(String vung) {
        this.vung = vung;
    }
    
    public void nhandangMau(){
        
        System.out.println("");
        System.out.println("============== Chon mau cua ca ==============");
        System.out.println("=== 1.Nau xam ===============================");//den
        System.out.println("=== 2.Sam dong nhat =========================");//trang
        System.out.println("=== 3.Vang nhat va co cham trang ============");//vang
        System.out.println("=== 4.Vang xam oliu va bung trang ===========");//phi
        System.out.println("=== 5.Mau sac loan lo =======================");//lai
        
        do {            
            System.out.println("Nhap lua chon: ");
            choose = n.NhapInt("");
            if(choose < 1 || choose > 5){
                System.out.println("Chi duoc chon tu 1 den 5");
            }
        } while (choose < 1 || choose > 5);
        switch (choose) {
            case 1:
                tong_choose =+ 15;
                break;
            case 2:
                tong_choose += 24;
                break;
            case 3:
                tong_choose += 33;
                break;
            case 4:
                tong_choose += 42;
                break;
            default:
                tong_choose += 51;
                break;
        } 
    }
    
    public void nhandangChieudai(){
        
        System.out.println("========== Chon chieu dai cua ca ============");
        System.out.println("=== 1. 9,6 den 24,5cm =======================");//den
        System.out.println("=== 2. 26,3 den 47cm ========================");//trang
        System.out.println("=== 3. 120cm ================================");//vang
        System.out.println("=== 4. 150cm ================================");//phi
        System.out.println("=== 5. 40 den 60cm ==========================");//lai
        do {            
            System.out.println("Nhap lua chon");
            choose = n.NhapInt("");
            if(choose < 1 || choose > 5){
                System.out.println("Chi duoc nhap tu 1 den 5");
            }
        } while (choose < 1 || choose > 5);
        switch(choose){
            case 1:
                tong_choose += 15;
                break;
            case 2:
                tong_choose += 24;
                break;
            case 3:
                tong_choose += 33;
                break;
            case 4:
                tong_choose += 42;
            default:
                tong_choose += 51;
        }
    }
    
    public void nhandangCautao(){
        System.out.println("=========== Chon dat diem cua ca ============");
        System.out.println("=== 1. Co 4 den 6 rau =======================");//den
        System.out.println("=== 2. Can nang 1,2kg =======================");//trang
        System.out.println("=== 3. Thon dai ve duoi =====================");//vang
        System.out.println("=== 4. Dau lon, xuong mat nho, mieng lon=====");//phi
        System.out.println("=== 5. Lai ca tre phi duc & ca tre vang cai==");//lai
        do {            
            System.out.println("Nhap lua chon: ");
            choose = n.NhapInt("");
            if(choose < 1 || choose > 5){
                System.out.println("Chi duoc nhap tu 1 den 4");
            }
        } while (choose < 1 || choose > 5);
        switch(choose){
            case 1:
                tong_choose += 15;
                break;
            case 2:
                tong_choose += 24;
                break;
            case 3:
                tong_choose += 33;
                break;
            case 4:
                tong_choose += 42;
                break;
            default:
                tong_choose += 51;
        }
    }
//    public static void CaTreden(){
//        String mau = "Nâu xám";
//        String rau = "4 đến 6";
//        String chieudai = "9,6 đến 24,5 cm";
//    }
//    public static void CaTretrang(){
//        String mau = "Sậm đồng nhất";
//        String chieudai = "26,3 đến 47cm";
//        String khoiluong = "1,2kg";
//    }
//    public static void CaTrevang(){
//        String datdiem = "thon và dài về đuôi";
//        String rau = "8";
//        String chieudai = "120cm";
//    }
//    public static void CaTrephi(){
//        String đatiem = "đầu lớn,xương mắt nhỏ, miệng lớn";
//        String rau = "8";
//        String ma="vàng cát, vàng xám oliu, bụng trắng";
//        String chieudai = "40 den 60 cm";
//    }
//    public static void CaTrelai(){
//        String đatiem ="lai giữa cá trê phi đực và cá trê vàng cái";
//        String màu = "vàng khi nhỏ, màu loan lổ giống cá trê phi khi lớn";
//    }
    public void deXuat(){
        if(tong_choose == 45 ){
            System.out.println("De xuat dua tren lua chon cua ban: Ca tre Den");
        }
        else if (tong_choose == 72 ){
            System.out.println("De xuat dua tren lua chon cua ban: Ca tre Trang");
        }
        else if (tong_choose == 99 ){
            System.out.println("De xuat dua tren lua chon cua ban: Ca tre Vang");
        }
        else if (tong_choose == 126){
            System.out.println("De xuat dua tren lua chon cua ban: Ca tre Phi");
        }
        else if (tong_choose == 153){
            System.out.println("De xuat dua tren lua chon cua ban: Ca tre Lai");
        }
        else{
            System.out.println("Khong tim thay loai ca co cung dat diem !!");
        }
    }
    @Override
     public void nhapCa(){
         Scanner sc = new Scanner(System.in);
         super.nhapCa();
         
         System.out.println("Nhap ho: ");
         this.ho = sc.nextLine();
         System.out.println("Nhap vung song (Nuoc ngot/Nuoc man/Nuoc loi): ");
         this.vung = sc.nextLine();
     }
   public void xuatCa(){
       super.xuatCa();
       
       System.out.println("Ho ca tre: "+this.ho);
       System.out.println("Vung song: "+this.vung);
   }
    
}

