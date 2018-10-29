//package com.atikah.restpelatihan.restpelatihan.dao.impl;
//
//import com.atikah.restpelatihan.restpelatihan.common.Table;
//import com.atikah.restpelatihan.restpelatihan.dao.KrsDAO;
//import com.atikah.restpelatihan.restpelatihan.entity.Krs;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.stereotype.Repository;
//
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.List;
//import java.util.Objects;
//
//@Repository
//public class KrsDAOImpl implements KrsDAO {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public Krs save(Krs param) {
//        String sql = "INSERT INTO " + Table.TABLE_Krs+ " (no, npm_mhs, id_jurusan, id_matkul, dospem, semester,tahun_ajaran) VALUES (?, ?,?,?,?,?,?)";
//
//        final KeyHolder keyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(con -> {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, param.getNo());
//            ps.setInt(2, param.getId());
//            ps.setInt(3, param.getIdJurusan());
//            ps.setInt(4, param.getId());
//            ps.setString(5, param.getDospem());
//            ps.setInt(6, param.getSemester());
//            ps.setString(7, param.getTahunAjaran());
//            return ps;
//        }, keyHolder);
//
//        param.setIdKrs(Objects.requireNonNull(keyHolder.getKey()).intValue());
//        return param;
//    }
//
//    @Override
//    public Krs update(Krs param) {
//        return null;
//    }
//
//    @Override
//    public int delete(Krs param) {
//        return 0;
//    }
//
//    @Override
//    public List<Krs> find() {
//        String sql = "SELECT * FROM " + Table.TABLE_Krs;
//
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Krs.class));
//    }
//
//    @Override
//    public Krs findByFakultas(int idFakultas) {
//        return null;
//    }
//
//    @Override
//    public Krs findByJurusan(int idJurusan) {
//        return null;
//    }
//
//    @Override
//    public Krs findByMahasiswa(int npmMhs) {
//        return null;
//    }
//
//    @Override
//    public Krs findByKrs(int idKrs) {
//        return null;
//    }
//}
