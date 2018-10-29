package com.atikah.restthymeleaf.restthymeleaf.service.impl;

import com.atikah.restthymeleaf.restthymeleaf.dao.MahasiswaDAO;
import com.atikah.restthymeleaf.restthymeleaf.entity.Mahasiswa;
import com.atikah.restthymeleaf.restthymeleaf.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaDAO mahasiswaDAO;

    @Override
    public Mahasiswa save(Mahasiswa param) {
        return mahasiswaDAO.save(param);
    }

    @Override
    public Mahasiswa update(Mahasiswa param) {
        return mahasiswaDAO.update(param);
    }

    @Override
    public int delete(Mahasiswa param) {
        return mahasiswaDAO.delete(param);
    }

    @Override
    public List<Mahasiswa> find() {
        return mahasiswaDAO.find();
    }

    @Override
    public Mahasiswa findById(int id) {
        return mahasiswaDAO.findById(id);
    }
    @Override
    public List<Mahasiswa> findByName (Mahasiswa param){
        return mahasiswaDAO.findByName(param);
    }

}
