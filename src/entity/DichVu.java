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
public class DichVu implements Serializable{
    private int maDV;
    private String ten;
    private int giacuoc;
    private String dv;

    public DichVu() {
    }

    public DichVu(int maDV, String ten, int giacuoc, String dv) {
        this.maDV = maDV;
        this.ten = ten;
        this.giacuoc = giacuoc;
        this.dv = dv;
    }

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiacuoc() {
        return giacuoc;
    }

    public void setGiacuoc(int giacuoc) {
        this.giacuoc = giacuoc;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }
    public Object[] toObject(){
        return new Object[]{maDV, ten, giacuoc, dv};
    }
}
