package com.atikah.restthymeleaf.restthymeleaf.dao;

import com.atikah.restthymeleaf.restthymeleaf.entity.Jurusan;

import java.util.List;

public interface JurusanDAO extends BaseDAO<Jurusan> {
    List<Jurusan> findByName(Jurusan param);
}
