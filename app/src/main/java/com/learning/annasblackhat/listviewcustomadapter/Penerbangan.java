package com.learning.annasblackhat.listviewcustomadapter;

import java.io.Serializable;

/**
 * Created by annasblackhat on 10/29/15.
 */
public class Penerbangan implements Serializable {
    String maskapai;
    String kotaAsal;
    String kotaTujuan;
    String jamBerangkat;
    String jamSampai;
    int harga;

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public void setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }

    public String getJamSampai() {
        return jamSampai;
    }

    public void setJamSampai(String jamSampai) {
        this.jamSampai = jamSampai;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
