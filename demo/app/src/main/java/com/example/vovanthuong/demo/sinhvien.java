package com.example.vovanthuong.demo;

/**
 * Created by VoVanThuong on 5/2/2018.
 */

public class sinhvien {
    private String ten;
    private String tuoi;
    private String lop;

    public sinhvien(String ten, String tuoi, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public sinhvien() {

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
