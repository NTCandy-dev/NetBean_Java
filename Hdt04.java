
package hdt04;

import java.util.Scanner;


public class Hdt04 {

    public static void main(String[] args) {
        so n = new so();
        Scanner sc = new Scanner(System.in);
        Sinhvien sv = new Sinhvien();
        Caodang cd = new Caodang("Bao", 2005,"CNTT",112233);
        Trungcap tc = new Trungcap("Bao", 2004, "cntt",332211);
     System.out.println("==========================");
     System.out.println("====== CHON CAP BAC ======");
     System.out.println("1.Cao dang");
     System.out.println("2.Trung cap");
     System.out.println("3.Thoat chuong trinh");
     System.out.println("==========================");
     System.out.print("Nhap lua chon: ");
     int choose = n.NhapInt("");
     
     switch(choose){
          case 1:
            sv.nhapSinhvien();
            System.out.println("==========================");
            cd.nhapDiemnghe(sc);
            System.out.println("==========================");
            sv.xuatSinhvien();
            System.out.println("==========================");
            cd.xuatDiemnghe();
            break;
        case 2: 
            sv.nhapSinhvien();
            System.out.println("==========================");
             tc.nhapDiemnghe(sc);
             System.out.println("==========================");
             tc.nhapDiemTN(sc);
             System.out.println("==========================");
             tc.nhapDiemXH(sc);
             System.out.println("==========================");
             sv.xuatSinhvien();
             System.out.println("==========================");
             tc.xuatDiem();
             break;
        case 3:
            System.exit(0);
        default:
            System.out.println("Loi, ko nhan duoc ky tu !");
        }  
    }
}
