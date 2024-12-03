/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh3_07;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author Lenovo
 */
public class ThucHanh3_07 {
    public static class KhachHang{
        public String id;
        public String name;
        public String sex;
        public String date;
        public String address;

        public KhachHang(String id, String name, String sex, String date, String address) {
            this.id = id;
            this.name = name;
            this.sex = sex;
            this.date = date;
            this.address = address;
        }
        
    }
    public static class MatHang{
        public String id,name,unit;
        public int price1,price2;

        public MatHang(String id, String name, String unit, int price1, int price2) {
            this.id = id;
            this.name = name;
            this.unit = unit;
            this.price1 = price1;
            this.price2 = price2;
        }
    }
    public static class HoaDon{
        public String IDclient,IDproduct;
        public int quantity;

        public HoaDon(String IDclient, String IDproduct, int quantity) {
            this.IDclient = IDclient;
            this.IDproduct = IDproduct;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        ArrayList<KhachHang> ar1 = new ArrayList<>();
        ArrayList<MatHang> ar2 = new ArrayList<>();
        for(int i=1 ; i<=n ; i++)
        {
            String id = String.format("KH%03d",i);
            String name = sc1.nextLine();
            String sex = sc1.nextLine();
            String date = sc1.nextLine();
            String address = sc1.nextLine();
            KhachHang kh = new KhachHang(id,name,sex,date,address);
            ar1.add(kh);
        }
        int m = sc2.nextInt();
        sc2.nextLine();
        for(int i=1 ; i<=m ; i++)
        {
            String id = String.format("MH%03d",i);
            String name = sc2.nextLine();
            String unit = sc2.nextLine();
            int price1 = Integer.valueOf(sc2.nextLine());
            int price2 = Integer.valueOf(sc2.nextLine());
            ar2.add(new MatHang(id,name,unit,price1,price2));
        }
        int p = sc3.nextInt();
        for(int i=1 ; i<=p ; i++)
        {
            String id = String.format("HD%03d",i);
            String id_cus = sc3.next();
            String id_product = sc3.next();
            int quantity = sc3.nextInt();
            System.out.print(id + " ");
            for(KhachHang k : ar1)
            {
                if(k.id.equals(id_cus))
                {
                    System.out.print(k.name + " " + k.address + " ");
                    break;
                }
            }
            for(MatHang k : ar2)
            {
                if(k.id.equals(id_product))
                {
                    System.out.println(k.name + " " + k.unit + " " + k.price1 + " " + k.price2 + " " + quantity + " " + k.price2*quantity );
                    break;
                }
            }
        }
    }
}
