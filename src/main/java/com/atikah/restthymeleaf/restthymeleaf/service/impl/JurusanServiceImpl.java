package com.atikah.restthymeleaf.restthymeleaf.service.impl;


import com.atikah.restthymeleaf.restthymeleaf.dao.FakultasDAO;
import com.atikah.restthymeleaf.restthymeleaf.dao.JurusanDAO;
import com.atikah.restthymeleaf.restthymeleaf.entity.Fakultas;
import com.atikah.restthymeleaf.restthymeleaf.entity.Jurusan;
import com.atikah.restthymeleaf.restthymeleaf.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JurusanServiceImpl implements JurusanService {


    @Autowired
    private JurusanDAO jurusanDAO;

//    //tambah
//    @Autowired
//    private FakultasDAO fakultasDAO;



    @Override
    public Jurusan save(Jurusan param) {
        return jurusanDAO.save(param);
//        return fakultasDAO.save(param); //tambah
    }

    @Override
    public Jurusan update(Jurusan param) {
        return jurusanDAO.update(param);
    }

    @Override
    public int delete(Jurusan param) {
        return jurusanDAO.delete(param);
    }



    @Override
    public List<Jurusan> find(){
       return jurusanDAO.find();
    }

    @Override
    public Jurusan findById(int id) {
        return jurusanDAO.findById(id);
    }

    @Override
    public List<Jurusan> findByName (Jurusan param){
        return jurusanDAO.findByName(param);
    }
}