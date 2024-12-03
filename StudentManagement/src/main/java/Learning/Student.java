package Learning;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Student {
    String code;
    String name;
    int birthYear;
    String address;
    
    public Student()
    {
        code = "1";
        name = "Test";
        birthYear = 2000;
        address = "VN";
    }
    public Student(String code, String name, int birthYear , String address)
    {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;                
    }
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        code = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        birthYear = sc.nextInt();
        sc.nextLine();
        address = sc.nextLine();
    }
    public void output(){
        System.out.println("code "+code);
        System.out.println("name "+name);
        System.out.println("birthYear "+ birthYear);
        System.out.println("address "+ address);
    }
}
