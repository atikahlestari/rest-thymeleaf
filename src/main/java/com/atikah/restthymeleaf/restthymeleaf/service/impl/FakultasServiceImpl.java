package com.atikah.restthymeleaf.restthymeleaf.service.impl;


import com.atikah.restthymeleaf.restthymeleaf.dao.FakultasDAO;
import com.atikah.restthymeleaf.restthymeleaf.entity.Fakultas;
import com.atikah.restthymeleaf.restthymeleaf.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FakultasServiceImpl  implements FakultasService{

    @Autowired
    private FakultasDAO fakultasDAO;

    @Override
    public Fakultas save (Fakultas param){
        return  fakultasDAO.save(param);
    }

    @Override
    public Fakultas update(Fakultas param){

       return  fakultasDAO.update(param);
    }

    @Override
    public int delete(Fakultas param){

        return fakultasDAO.delete(param);
    }

    @Override
    public List<Fakultas> find(){

        return fakultasDAO.find();
    }

    @Override
    public Fakultas findById(int id) {
        return fakultasDAO.findById(id);
    }


    @Override
    public List<Fakultas> findByName(Fakultas param) {
        return fakultasDAO.findByName(param);
    }
}
