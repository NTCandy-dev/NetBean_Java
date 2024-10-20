package product;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoang bao
 */
public class Product {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userlist = new ArrayList<String>();
        check_condition n = new check_condition();
        
        System.out.print("Nhap ten nguoi dung: ");
        String username = n.NhapStirng("");
        userlist.add(username);
        System.out.println("==========================");
        System.out.println("1.VAT=====================");
        System.out.println("2.%VAT====================");
        System.out.println("==========================");
        System.out.println("Chon loai VAT: ");
        int loaiThue = n.NhapInt("");
 
        double giaTriThue = 0;
        if (loaiThue == 1) { 
            System.out.print("Nhap gia tri VAT co dinh: ");
            giaTriThue = n.NhapFLoat("");
            
        } else if (loaiThue == 2) {
            System.out.print("Nhap %VAT: ");
            giaTriThue = n.NhapFLoat("");
        }
        
         Hoadon_do hoaDonDo;
        if (loaiThue == 1) {
            hoaDonDo = new VAT(giaTriThue); 
        } else {
            hoaDonDo = new VAT_percent(giaTriThue); 
        }
        boolean tiepTucNhap = true;
        while(tiepTucNhap){
        System.out.print("Nhap ma vat tu: ");
        int IdVT = n.NhapInt("");
        System.out.print("Nhap ten vat tu: ");
        String NameVT  = n.NhapStirng("");
        System.out.print("Nhap so luong: ");
        int Quantity = n.NhapInt("");
        System.out.print("Nhap khoi luong: ");
        double Weight = n.NhapFLoat("");
        System.out.println("Nhap don vi tinh:");
        String Unit = n.NhapStirng("");
        System.out.print("Nhap don gia: ");
        double Price = n.NhapFLoat("");
        System.out.print("Nhap loai vat tu: ");
        String Type = n.NhapStirng("");
        System.out.print("Nhap ngay: ");
        String Date = n.NhapStirng("");
        Vattu vatTu = new Vattu(IdVT,Quantity, NameVT, Type, Date, Unit, Weight, Price);
        hoaDonDo.themVatTu(vatTu);
        System.out.print("Ban muon tiep tuc nhap? (1: Co, 0: Khong): ");
            int chon = n.NhapInt("");
            if (chon == 0) {
                break;
            }
        }
         System.out.println("\nHoa don cua " + username + ":");
        hoaDonDo.hienThiHoaDon();
        System.out.println("Tong tien truoc thue: " + hoaDonDo.tinhTongTien());
        System.out.println("Tong tien sau thue: " + hoaDonDo.tinhTongTienSauThue());
    }
        
}       
 

