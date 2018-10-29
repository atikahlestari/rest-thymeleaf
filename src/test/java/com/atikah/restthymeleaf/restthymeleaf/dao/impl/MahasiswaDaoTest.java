//package com.atikah.restthymeleaf.restthymeleaf.dao.impl;
//
//import com.atikah.restthymeleaf.restthymeleaf.dao.MahasiswaDAO;
//import com.atikah.restthymeleaf.restthymeleaf.dao.MatakuliahDAO;
//import com.atikah.restthymeleaf.restthymeleaf.entity.Mahasiswa;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MahasiswaDaoTest {
//
//    @Autowired
//    private MahasiswaDAO mahasiswaDAO;
//
//    @Test
//    public void insert(){
//        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(26/09/2018);
//        Mahasiswa mahasiswa = new Mahasiswa();
//        mahasiswa.setNama("nama");
//        mahasiswa.setAlamat("alamat");
//        mahasiswa.setTempat("tempat");
////        mahasiswa.setTanggal(new Date());
//        mahasiswa.setTanggal("2018-09-26");
//        mahasiswa.setIdJurusan(1);
//        mahasiswa.setAyah("ayah");
//        mahasiswa.setIbu("Ibu");
//
//       Mahasiswa result = mahasiswaDAO.save(mahasiswa);
//       if (result.getId() != 0){
//           System.out.println("INSERT BERHASIL");
//       } else {
//           System.out.println("Insert GAGAL");
//       }
//    }
//
//}
//
//
