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
public class Ca {
    protected String moitruong;
    protected String loaida;
    protected String xuongsong;

    so_ca n = new so_ca();
    
    public Ca(String moitruong, String loaida, String xuongsong) {
        this.moitruong = moitruong;
        this.loaida = loaida;
        this.xuongsong = xuongsong;
    }

    public String getMoitruong() {
        return moitruong;
    }

    public void setMoitruong(String moitruong) {
        this.moitruong = moitruong;
    }

    public String getLoaida() {
        return loaida;
    }

    public void setLoaida(String loaida) {
        this.loaida = loaida;
    }

    public String getXuongsong() {
        return xuongsong;
    }

    public void setXuongsong(String xuongsong) {
        this.xuongsong = xuongsong;
    }

   public void nhapCa(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap moi truong song: ");
       this.moitruong = sc.nextLine();
       System.out.println("Nhap loai da: ");
       this.loaida = sc.nextLine();
       
   }


   public void xuatCa(){
       System.out.println("Moi truong: "+this.moitruong);
       System.out.println("Loai da: "+this.loaida);
       System.out.println("Xuong: "+this.xuongsong);
   }
}
