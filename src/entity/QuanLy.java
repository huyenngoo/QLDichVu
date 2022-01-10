/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class QuanLy implements Serializable{
    private int maKH;
    private String tenKH;
    private int maDV;
    private String tenDV;
    private int sl;

    public QuanLy() {
    }

    public QuanLy(int maKH, String tenKH, int maDV, String tenDV, int sl) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.sl = sl;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    public Object[] toObject(){
        return new Object[]{maKH, tenKH, maDV, tenDV, sl};
    }
}
