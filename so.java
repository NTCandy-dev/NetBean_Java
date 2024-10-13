
package hdt04;


import java.util.Scanner;
public class so {
     public String NhapStirng(String s){
        Scanner input = new Scanner(System.in);
       
        boolean f = false;
        String n = null;
        while(!f){
            try {
                System.out.print(s + "");
                 n = input.nextLine();
                 f = true;
            }
            catch(Exception e){
                System.out.println("Chi nhap ky tu ! ");
               input.nextLine();
            }
        }
        return n;
    }
     
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
             }
         }
         return (n);
     }
}
