package com.atikah.restthymeleaf.restthymeleaf.service;


import com.atikah.restthymeleaf.restthymeleaf.entity.Jurusan;

import java.util.List;

public interface JurusanService extends BaseService<Jurusan> {
    List<Jurusan> findByName(Jurusan param);
}
