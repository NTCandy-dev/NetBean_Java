/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chayca;

import java.util.Scanner;

/**
 *
 * @author hoang bao
 */
public class ChayCa {

     public static String bone(){
        Scanner sc = new Scanner(System.in);
        String xuongsong;
        System.out.println("Loai ca nay co xuong song ?(Co/Khong): ");
        return xuongsong = sc.nextLine();
    }

    public static void main(String[] args) {
        so_ca n = new so_ca();
        String xuongsong = bone();
        if(xuongsong.equals("Co") || xuongsong.equals("co") || xuongsong.equals("CO")){
           System.out.println("=== Chon loai ca ===");
           System.out.println("=== 1. Ca thu ======");
           System.out.println("=== 2. Ca tre ======");
           int choose;
           do {               
               System.out.println("Nhap lua chon: ");
               choose = n.NhapInt("");
           } while (choose<1 || choose > 2);
           
           switch(choose){
               case 1:
                   CaThu ct = new CaThu("Nuoc", "Tron", xuongsong, "Ca thu ngu", "Dau ca", 1.63);
                   ct.nhapCa();
                   System.out.println("===========");
                   ct.xuatCa();
                   break;
               default:
                   CaTre ctr = new CaTre("nuoc", "tron", xuongsong, "Clariidae", "Nuoc ngot");
                   ctr.nhapCa();
                   ctr.nhandangMau();
                   ctr.nhandangChieudai();
                   ctr.nhandangCautao();
                   System.out.println("===========");
                   ctr.deXuat();
                   ctr.xuatCa();
                   break;     
           }
       }
       else{
           CaDuoi cd = new CaDuoi("Nuoc", "tron", "Khong", "Dai duong", "Ray");
           System.out.println("=== Chi co ca duoi la loai khong xuong ! ===");
           cd.nhapCa();
           cd.datDiem();
           cd.kichThuoc();
           System.out.println("===========");
           cd.deXuat();
           cd.xuatCa();
       }
    }
    
}
