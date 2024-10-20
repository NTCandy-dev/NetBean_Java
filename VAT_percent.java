
package product;

/**
 *
 * @author hoang bao
 */
public class VAT_percent extends Hoadon_do {
   private double phanTramVAT;

    public VAT_percent(double phanTramVAT) {
        this.phanTramVAT = phanTramVAT;
    }

    @Override
    public double tinhTongTienSauThue() {
        double tongTienTruocThue = super.tinhTongTien();
        return tongTienTruocThue + (tongTienTruocThue * phanTramVAT / 100);  // Thêm %VAT
    }
}

