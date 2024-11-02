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
public class CaThu extends Ca{
    private String ho;
    private String economy;
    private double chieudai;

    public CaThu(String moitruong, String loaida, String xuongsong, String ho, String economy, double chieudai) {
        super(moitruong, loaida, xuongsong);
        this.ho=ho;
        this.economy=economy;
        this.chieudai=chieudai;
    }

   so_ca n = new so_ca();

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getEconomy() {
        return economy;
    }

    public void setEconomy(String economy) {
        this.economy = economy;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }
    

     
//    @Override
//    public String toString() {
//        return "CaThu{" + "ho=" + ho + ", economy=" + economy + ", chieudai=" + chieudai + '}';
//    }
      @Override
    public void nhapCa(){
        Scanner sc = new Scanner(System.in);
        super.nhapCa();
        
        System.out.println("Nhap ho: ");
        this.ho = sc.nextLine();
        System.out.println("Gia tri kinh te: ");
        this.economy = sc.nextLine();
        System.out.println("Nhap chieu dai: ");
        this.chieudai = n.NhapFLoat("");
    }
    public void xuatCa(){
        super.xuatCa();
        
        System.out.println("Ho: "+this.ho);
        System.out.println("Gia tri kinh te: "+this.economy);
        System.out.println("Chieu dai: "+this.chieudai);
    }
}
 
