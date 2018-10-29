package com.atikah.restthymeleaf.restthymeleaf.dao;

import com.atikah.restthymeleaf.restthymeleaf.entity.Mahasiswa;


import java.util.List;


public interface MahasiswaDAO extends BaseDAO<Mahasiswa> {
    List<Mahasiswa> findByName(Mahasiswa param);

}
