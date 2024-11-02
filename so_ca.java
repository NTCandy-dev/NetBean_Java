/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chayca;

import java.util.Scanner;

/**
 *
 * @author hoang bao
 */
public class so_ca {
     
     public float NhapFLoat(String s){
         Scanner input = new Scanner(System.in);
         boolean f = false;
         float n = 0;
         while(!f){
             try{
                 System.out.print(s + "");
                 n=input.nextFloat();
                 f=true;
             }
             catch(Exception e){
                 System.out.println("Nhap so thoi !");
                 input.nextLine();
                  System.out.print("Nhap lai: ");
             }
         }
         return (n);
     }
     
      public int NhapInt(String s){
         Scanner input = new Scanner(System.in);
         boolean f = false;
         int n = 0;
         while(!f){
             try{
                 System.out.print(s + "");
                 n=input.nextInt();
                 f=true;
             }
             catch(Exception e){
                 System.out.println("Nhap so nguyen thoi !");
                 input.nextLine();
                 System.out.print("Nhap lai: ");
             }
         }
         return (n);
     }
}


