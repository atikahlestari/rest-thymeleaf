package com.atikah.restthymeleaf.restthymeleaf.dao;

import com.atikah.restthymeleaf.restthymeleaf.entity.Matakuliah;

import java.util.List;

public interface MatakuliahDAO extends BaseDAO<Matakuliah> {
    List<Matakuliah> findByName(Matakuliah param);
}
