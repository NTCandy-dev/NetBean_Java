
package product;

import java.util.ArrayList;

/**
 *
 * @author hoang bao
 */
public class Hoadon {
    private ArrayList<Vattu> danhSachVatTu = new ArrayList<Vattu>();
     public void themVatTu(Vattu vatTu) {
        danhSachVatTu.add(vatTu);
    }

    public void hienThiHoaDon() {
        for (Vattu vatTu : danhSachVatTu) {
            System.out.println(vatTu.toString());
        }
    }
    
    public double tinhTongTien() {
        double tongTien = 0;
        for (Vattu vatTu : danhSachVatTu) {
            tongTien += vatTu.ThanhTien();
        }
        return tongTien;
    }
}