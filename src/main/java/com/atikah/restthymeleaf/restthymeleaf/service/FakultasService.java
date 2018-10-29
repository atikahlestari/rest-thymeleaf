package com.atikah.restthymeleaf.restthymeleaf.service;

import com.atikah.restthymeleaf.restthymeleaf.entity.Fakultas;


import java.util.List;

public interface FakultasService extends BaseService<Fakultas> {
    List<Fakultas> findByName (Fakultas param);
}
