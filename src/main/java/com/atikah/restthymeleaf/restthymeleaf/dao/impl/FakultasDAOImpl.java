package com.atikah.restthymeleaf.restthymeleaf.dao.impl;

import com.atikah.restthymeleaf.restthymeleaf.common.Table;
import com.atikah.restthymeleaf.restthymeleaf.dao.FakultasDAO;
import com.atikah.restthymeleaf.restthymeleaf.entity.Fakultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;


@Repository
public class FakultasDAOImpl implements FakultasDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Fakultas save(Fakultas param) {
       // String sql = "INSERT INTO " + Table.TABLE_FAKULTAS + " (nama) VALUES (?)";
        String sql= "CALL insertFakultas (?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getNama());
            return ps;
        }, keyHolder);
        param.setId(1);
        //param.setId(Objects.requireNonNull(keyHolder.getKey().intValue()));
        return param;
    }

    @Override
    public Fakultas update(Fakultas param) {
      /* String sql= "UPDATE " + Table.TABLE_FAKULTAS +  " SET "+
               "nama = ? "+
                "WHERE id = ?";*/
               String sql= "CALL updateFakultas (?,?)";

        jdbcTemplate.update(sql,
                param.getNama(),
                 param.getId());
        return param;

    }


    @Override
    public int delete(Fakultas param) {
//        return 0;

        /*String sql= "DELETE FROM " + Table.TABLE_FAKULTAS+
                " WHERE id = ? ";*/

        String sql="CALL deleteFakultas (?)";
        final int delete = jdbcTemplate.update(sql, param.getId());
        return delete;
    }

    @Override
    public List<Fakultas>  find() {
        String sql = "SELECT * FROM " + Table.TABLE_FAKULTAS;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Fakultas.class)); //beanproperty menyamakan database
    }

    @Override
    public Fakultas findById(int id) {
        String sql = "SELECT * FROM " + Table.TABLE_FAKULTAS + " WHERE id = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Fakultas.class), id);
        } catch (EmptyResultDataAccessException ignored) {
        }

        return null;
    }

    @Override
    public List<Fakultas> findByName(Fakultas param) {
        String sql = "SELECT * FROM " + Table.TABLE_FAKULTAS + " WHERE nama LIKE  ?";
        return jdbcTemplate.query(sql, new Object[]{"%" + param.getNama() + "%"}, new BeanPropertyRowMapper<>(Fakultas.class));
    }
}


