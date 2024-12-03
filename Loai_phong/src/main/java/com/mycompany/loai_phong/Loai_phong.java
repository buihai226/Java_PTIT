/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loai_phong;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */


class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyhieu,loai;
    private int gia;
    private double phi;
    public LoaiPhong(String s){
        String[] arr = s.split("\\s+");
        this.kyhieu = arr[0];
        this.loai = arr[1];
        this.gia = Integer.parseInt(arr[2]);
        this.phi = Double.parseDouble(arr[3]);
    }
    
    @Override
    public int compareTo(LoaiPhong other) {
        return this.loai.compareTo(other.loai);
    }
    
    
    public String getLoai() {
        return loai;
    }

    @Override
    public String toString() {
        return kyhieu + " " + loai + " " + gia + " " + phi;
    }
    
    
}

public class Loai_phong {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
