//package com.atikah.restpelatihan.restpelatihan.entity;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import java.io.Serializable;
//
//public class Krs implements Serializable {
//
//    private int no;
//    private int idKrs;
//    private int npmMhs;
//    private int idJurusan;
//    private int idMatkul;
//    private String dospem;
//    private int semester;
//    private String tahunAjaran;
//
//    public Krs(){
//
//    }
//
//    public Krs(int no,int npmMhs, int idKrs, int idJurusan, int idMatkul, int semester){
//        this.no=no;
//        this.npmMhs=npmMhs;
//        this.idKrs=idKrs;
//        this.idJurusan=idJurusan;
//        this.idMatkul=idMatkul;
//        this.semester=semester;
//    }
//
//    public Krs( String dospem,  String tahunAjaran){
//
//        this.dospem=dospem;this.semester=semester;
//        this.tahunAjaran=tahunAjaran;
//    }
//
//    public int getNo() {
//        return no;
//    }
//
//    public void setNo(int no) {
//        this.no = no;
//    }
//
//    public int getIdKrs() {
//        return idKrs;
//    }
//
//    public void setIdKrs(int idKrs) {
//        this.idKrs = idKrs;
//    }
//
//    public int getId() {
//        return npmMhs;
//    }
//
//    public void setId(int npmMhs) {
//        this.npmMhs = npmMhs;
//    }
//
//    public int getIdJurusan() {
//        return idJurusan;
//    }
//
//    public void setIdJurusan(int idJurusan) {
//        this.idJurusan = idJurusan;
//    }
//
//    public int getId() {
//        return idMatkul;
//    }
//
//    public void setId(int idMatkul) {
//        this.idMatkul = idMatkul;
//    }
//
//    public String getDospem() {
//        return dospem;
//    }
//
//    public void setDospem(String dospem) {
//        this.dospem = dospem;
//    }
//
//    public int getSemester() {
//        return semester;
//    }
//
//    public void setSemester(int semester) {
//        this.semester = semester;
//    }
//
//    public String getTahunAjaran() {
//        return tahunAjaran;
//    }
//
//    public void setTahunAjaran(String tahunAjaran) {
//        this.tahunAjaran = tahunAjaran;
//    }
//
//    @Override
//    public String toString() {
//        return "Krs{" +
//                "no=" + no +
//                "idKrs=" + idKrs +
//                ", npmMhs=" + npmMhs + '\'' +
//                "idJurusan=" + idJurusan +
//                "idMatkul=" + idMatkul +
//                ",dospem=" + dospem +'\'' +
//                "semester=" + semester + '\'' +
//                ", tahunAjaran='" + tahunAjaran + '\'' +
//                '}';
//    }
//
//}
