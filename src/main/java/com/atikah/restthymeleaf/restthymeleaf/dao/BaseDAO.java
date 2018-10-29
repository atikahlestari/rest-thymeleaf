package com.atikah.restthymeleaf.restthymeleaf.dao;

import java.util.List;
public interface BaseDAO<T> {

    T save(T param);

    T update(T param);

    int delete(T param);

    List<T> find();

    T findById(int id);

//    T findByJurusan (int idJurusan);
//
//    T findByMahasiswa (int npmMhs);

//    T findByMatkul (int idMatkul);
//
//    T findByKrs (int idKrs);
}

