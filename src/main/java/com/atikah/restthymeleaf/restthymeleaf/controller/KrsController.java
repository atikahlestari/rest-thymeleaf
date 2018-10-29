//package com.atikah.restpelatihan.restpelatihan.controller;
//
//import com.atikah.restpelatihan.restpelatihan.entity.Krs;
//import com.atikah.restpelatihan.restpelatihan.service.KrsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//public class KrsController {
//
//    @Autowired
//    private KrsService service;
//
//    @GetMapping(value = "/krs")
//    public List<Krs> krs(){
//        return service.find();
//    }
//
//    @PostMapping(value = "/krs")
//    public String save(@RequestBody Krs krs){
//        Krs data= service.save(krs);
//        if (data.getIdKrs() == 0) {
//            return "Gagal insert data";
//        } else {
//            return "Insert data berhasil";
//        }
//    }
//}
