package com.atikah.restthymeleaf.restthymeleaf.dao;

import com.atikah.restthymeleaf.restthymeleaf.entity.Fakultas;

import java.util.List;

public interface FakultasDAO  extends BaseDAO<Fakultas> {
    List<Fakultas> findByName(Fakultas param);
}
