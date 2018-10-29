package com.atikah.restthymeleaf.restthymeleaf.entity;

import java.io.Serializable;
//import java.util.Date;
import java.sql.*;

public class Mahasiswa implements Serializable {
    private int id;
    private String nama;
    private String tempat;
    private Date tanggal;
    private String alamat;
    private String ayah;
    private String ibu;
    private int idJurusan;

    private Jurusan jurusan;
    private Fakultas fakultas;





    public Mahasiswa(int id, int idJurusan){
    this.id = id;
    this.idJurusan=idJurusan;
    }

    public Mahasiswa(String nama, String tempat,Date tanggal,
                     String alamat, String ayah, String ibu){

        this.nama = nama;
        this.tempat = tempat;
        this.tanggal= tanggal;
        this.alamat = alamat;
        this.ayah = ayah;
        this.ibu = ibu;
    }

//    public Mahasiswa(Date tanggal){
//
//        this.tanggal = tanggal;
//    }

    public Mahasiswa(int id) {
        this.id=id;
    }

    public Mahasiswa() {

    }


    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAyah() {
        return ayah;
    }

    public void setAyah(String ayah) {
        this.ayah = ayah;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", tempat='" + tempat + '\'' +
                "tanggal=" + tanggal +
                ", alamat='" + alamat + '\'' +
                ", ayah='" + ayah + '\'' +
                ", ibu='" + ibu + '\'' +
                "idJurusan=" + idJurusan +
                '}';
    }


}
