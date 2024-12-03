/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lop_pair;

/**
 *
 * @author Lenovo
 */
public class Pair<X,Y> {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static boolean check(int n)
    {
        if(n < 2)
        {
            return false;
        }
        for(int i=2 ; i<=Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime()
    {
        return check(x) && check(y);
    }
    @Override
    public String toString()
    {
        return String.format("%d %d",x,y);
    }
}
