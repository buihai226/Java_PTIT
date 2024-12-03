/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracnghiem;

import java.util.List;

public class cauhoi {

    private String nd, stt,key;
    private List<String> da;

    public cauhoi(String nd, List<String> da, int id,String key) {
        this.da = da;
        this.nd = nd;
        this.stt = "cau" + id;
        this.key=key;
    }

    public String getNd() {
        return nd;
    }

    public List<String> getDa() {
        return da;
    }

    public String getStt() {
        return stt;
    }

    public String getKey() {
        return key;
    }
    
}