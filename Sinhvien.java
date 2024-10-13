
package hdt04;

import java.util.Scanner;

public class Sinhvien {
    private String name;
    private int yeardate;
    private String job;
    private int id;
    
    public Sinhvien(){
        
    }
    public Sinhvien(String name, int yeardate, String job, int id){
        this.name = name;
        this.yeardate = yeardate;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYeardate() {
        return yeardate;
    }

    public void setYeardate(int yeardate) {
        this.yeardate = yeardate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
        public void nhapSinhvien(){
        so n = new so();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name=n.NhapStirng("");
        System.out.print("Nhap nam sinh: ");
        yeardate=n.NhapInt("");
        System.out.print("Nhap nganh: ");
        job = n.NhapStirng("");
        System.out.print("Nhap cccd: ");
        id = n.NhapInt("");
    }
        
        public void xuatSinhvien(){
            System.out.println("Ten: "+name);
            System.out.println("Namsinh: "+yeardate);
            System.out.println("Nganh: "+job);
            System.out.println("Can cuoc cong dan: "+id);
        }
}

