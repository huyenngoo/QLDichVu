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
public class KhachHang implements Serializable{
    private int maKH;
    private String hoten, dchi, loai;

    public KhachHang() {
    }

    public KhachHang(int maKH, String hoten, String dchi, String loai) {
        this.maKH = maKH;
        this.hoten = hoten;
        this.dchi = dchi;
        this.loai = loai;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    public Object[] toObject(){
        return new Object[]{maKH, hoten, dchi, loai};
    }
}
