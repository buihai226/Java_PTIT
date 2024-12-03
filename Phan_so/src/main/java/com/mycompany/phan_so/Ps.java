/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phan_so;

/**
 *
 * @author Lenovo
 */
public class Ps {
    long tu;
    long mau;
    public long gcd(long tu, long mau)
    {
        if(mau == 0)
        {
            return tu;
        }
        else{
            return gcd(mau,tu%mau);
        }
    }
    public Ps(long tu,long mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    public void solve()
    {
        long ucln = gcd(this.tu,this.mau);
        long n_tu = this.tu/ucln;
        long n_mau = this.mau/ucln;
        System.out.println(n_tu +"/"+n_mau);
    }
}
