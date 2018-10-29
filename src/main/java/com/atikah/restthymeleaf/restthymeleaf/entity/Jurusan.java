package com.atikah.restthymeleaf.restthymeleaf.entity;

import java.io.Serializable;

public class Jurusan implements Serializable {

    private int id;
    private int idFakultas;
    private String nama;
    private Fakultas fakultas;//object join

    public Jurusan(int id){
        this.id= id;
    }

    public Jurusan(int id, int idFakultas){
        this.id = id;
        this.idFakultas=idFakultas;
    }

    public Jurusan (String nama){
        this.nama = nama;
    }

    public Jurusan() {
        this.id= id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(int idFakultas) {
        this.idFakultas = idFakultas;
    }
//join
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
    //

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }



    @Override
    public String toString() {
        return "Jurusan{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                "idFakultas='" + idFakultas +
                '}';
    }
}
