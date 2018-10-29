package com.atikah.restthymeleaf.restthymeleaf.service;

import com.atikah.restthymeleaf.restthymeleaf.entity.Mahasiswa;

import java.util.List;

public interface MahasiswaService extends BaseService<Mahasiswa> {
    List<Mahasiswa> findByName(Mahasiswa param);
}
