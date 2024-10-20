
package product;

/**
 *
 * @author hoang bao
 */
public class VAT extends Hoadon_do{
     private double giaTriVAT;

    public VAT(double giaTriVAT) {
        this.giaTriVAT = giaTriVAT;
    }

    @Override
    public double tinhTongTienSauThue() {
        double tongTienTruocThue = super.tinhTongTien();
        return tongTienTruocThue + giaTriVAT;  
    }
}
