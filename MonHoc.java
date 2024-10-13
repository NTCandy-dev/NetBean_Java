
package hdt04;

public class MonHoc {
    private String tenMonHoc;
    private double[] diem = new double [3];
    private int[] heSo = new int [3];

    public MonHoc(String tenMonHoc, double[] diem, int[] heSo) {
        this.tenMonHoc = tenMonHoc;
        this.diem = diem;
        this.heSo = heSo;
    }
    
    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }

    public int[] getHeSo() {
        return heSo;
    }

    public void setHeSo(int[] heSo) {
        this.heSo = heSo;
    }
    
    public double tinhDiemTrungBinh() {
        double tongDiem = 0;
        int tongheSo = 0;

        for (int i = 0; i < 3; i++) {
            tongDiem += diem[i] * heSo[i];  
            tongheSo += heSo[i];            
        }

        if (tongheSo == 0) {
            return 0; // Tránh chia cho 0
        }

        return tongDiem / tongheSo;
    }
    
      @Override
    public String toString() {
        return "Mon: " + tenMonHoc + ", Diem trung binh: " + tinhDiemTrungBinh();
    }
}

