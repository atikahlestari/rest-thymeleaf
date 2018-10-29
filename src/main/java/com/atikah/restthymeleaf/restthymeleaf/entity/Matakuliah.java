package com.atikah.restthymeleaf.restthymeleaf.entity;

import java.io.Serializable;

public class  Matakuliah implements Serializable {
   private  int id;
   private String nama;
   private String sks;

  public Matakuliah(){
       this.id=id;
   }

   public Matakuliah(int id){
       this.id = id;
   }

   public Matakuliah(String nama, String sks){
       this.nama = nama;
       this.sks = sks;
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

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }


    @Override
    public String toString() {
        return "Matakuliah{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", sks='" + sks + '\'' +
                '}';
    }

}
