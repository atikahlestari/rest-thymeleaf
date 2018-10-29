package com.atikah.restthymeleaf.restthymeleaf.service;

import com.atikah.restthymeleaf.restthymeleaf.entity.Matakuliah;

import java.util.List;

public interface MatakuliahService extends BaseService<Matakuliah> {
    List<Matakuliah> findByName (Matakuliah param);
}
