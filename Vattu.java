
package product;

/**
 *
 * @author hoang bao
 */
public class Vattu {
    private int IdVT;
    private int Quantity;
   
    private String NameVT;
    private String Type;
    private String Date;
    private String Unit;
    private double Weight;
    private double Price;
   
    
    check_condition n = new check_condition();
  
    public Vattu(int IdVT,int Quantity, String NameVT, String Type, String Date, String Unit, double Weight, double Price){
        this.IdVT = IdVT;
        this.Quantity = Quantity;
        this.NameVT = NameVT;
        this.Type = Type;
        this.Date = Date;
        this.Unit = Unit;
        this.Weight = Weight;
        this.Price = Price;
        
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public int getIdVT() {
        return IdVT;
    }

    public void setIdVT(int IdVT) {
        this.IdVT = IdVT;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getNameVT() {
        return NameVT;
    }

    public void setNameVT(String NameVT) {
        this.NameVT = NameVT;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
     public double ThanhTien() {
        return Price* Quantity;
    }
       
    
    @Override
    public String toString() {
        return "Ma vat tu " + IdVT + ", Ten vat tu: " + NameVT + ", Khoi luong: " + Weight +" "+Unit
               + ", Don gia: " + Price + ", So luong: " + Quantity;
    }
    

}
