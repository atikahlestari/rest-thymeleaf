package com.atikah.restthymeleaf.restthymeleaf.dao.impl;


import com.atikah.restthymeleaf.restthymeleaf.common.Table;
import com.atikah.restthymeleaf.restthymeleaf.dao.MahasiswaDAO;
import com.atikah.restthymeleaf.restthymeleaf.entity.Fakultas;
import com.atikah.restthymeleaf.restthymeleaf.entity.Jurusan;
import com.atikah.restthymeleaf.restthymeleaf.entity.Mahasiswa;
import javafx.scene.control.Tab;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public class MahasiswaDAOImpl implements MahasiswaDAO {

//    private SimpleJdbcCall CreateMahasiswaProc;
//
//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.CreateMahasiswaProc = new SimpleJdbcCall(dataSource).withProcedureName("insertMahasiswa").withReturnValue();
//    }
//


//    Map<String, Object> resultMap = jdbcTemplate.call(new CallableStatementCreator() {
//
//
//        @Override
////      public Mahasiswa save(Mahasiswa param) {
//        // String sql = "CALL  insertMahasiswa (?, ?, ?, ?, ?, ?, ?, ?)";
//
//        public CallableStatement createCallableStatement(Connection connection)
//                throws SQLException {
//
//            connection = jdbcTemplate.getDataSource().getConnection();
//            CallableStatement callableStatement = connection.prepareCall("{CALL  insertMahasiswa (?, ?, ?, ?, ?, ?, ?, ?)}");
//            callableStatement.setString(1, "nama");
//            callableStatement.setString(2, " tempat");
//            callableStatement.setDate(3, "tanggal");
//            callableStatement.setString(4, " alamat");
//            callableStatement.setString(5, "ayah");
//            callableStatement.setString(6, " ibu");
//            callableStatement.setInt(7, " idJurusan");
//            callableStatement.registerOutParameter(8, Types.VARCHAR);
//            callableStatement.executeUpdate();
//            return callableStatement;
//        }
//
//    }, paramList);
//}


//
//    @Override
//    public Mahasiswa save(Mahasiswa mahasiswa) {
//        int id;
//        SqlParameterSource inParams = new MapSqlParameterSource()
//                .addValue("v_nama", mahasiswa.getNama())
//                .addValue("v_tempat", mahasiswa.getTempat())
//                .addValue("v_tanggal", mahasiswa.getTanggal())
//                .addValue("v_alamat", mahasiswa.getAlamat())
//                .addValue("v_ayah", mahasiswa.getAyah())
//                .addValue("v_ibu", mahasiswa.getIbu())
//                .addValue("v_idJurusan", mahasiswa.getIdJurusan());
//
//        Map result = CreateMahasiswaProc.execute(inParams);
//        id = (int) result.get("id");
//        mahasiswa.setId(id);
//        return mahasiswa;
//    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Mahasiswa save(Mahasiswa param) {
        // String sql = "INSERT INTO " + Table.TABLE_MAHASISWA+ " ( nama, tempat,tanggal ,alamat, ayah, ibu,idJurusan) VALUES (?,?,?,?,?,?,?)";
        String sql = "CALL  insertMahasiswa (?, ?, ?, ?, ?, ?, ?,?)";
        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //isi sesuai jumlah data di procedure
            ps.setString(1, "1");
            ps.setString(2, param.getNama());
            ps.setString(3, param.getTempat());
            ps.setDate(4, new Date(param.getTanggal().getTime()));
            ps.setString(5, param.getAlamat());
            ps.setString(6, param.getAyah());
            ps.setString(7, param.getIbu());
            ps.setInt(8, param.getIdJurusan());// mas kenda
            return ps;
        }, keyHolder);
        param.setId(1);
//        param.setId(result);
        return param;
    }


    @Override
    public Mahasiswa update(Mahasiswa param) {

      /*  String sql = "UPDATE " + Table.TABLE_MAHASISWA + " SET " +
                "nama = ?, tempat = ?, tanggal = ?, alamat = ?," +
                "ayah = ?, ibu = ?, idJurusan = ? WHERE id = ?";*/

      String sql="CALL updateMahasiswa (?,?,?,?,?,?,?,?)";

        jdbcTemplate.update(sql,
                param.getNama(),
                param.getTempat(),
                param.getTanggal(),
                param.getAlamat(),
                param.getAyah(),
                param.getIbu(),
                param.getIdJurusan(),
                param.getId());
        return param;
    }


    @Override
    public int delete(Mahasiswa param) {
        String sql = "DELETE FROM " + Table.TABLE_MAHASISWA + " WHERE id = ? ";
        final int delete = jdbcTemplate.update(sql, param.getId());
        return delete;
    }

    @Override
    public List<Mahasiswa> find() {
        String sql = "SELECT " +
                "mahasiswa.id AS id, " +
                "mahasiswa.nama AS nama, " +
                "mahasiswa.tempat AS tempat, " +
                "mahasiswa.tanggal AS tanggal, " +
                "mahasiswa.alamat AS alamat, " +
                "mahasiswa.ayah AS ayah, " +
                "mahasiswa.ibu AS ibu, " +
                "jurusan.id AS idJurusan, " +
                "jurusan.nama AS namaJurusan, " +
                "fakultas.id AS idFakultas, " +
                "fakultas.nama AS namaFakultas " +
                "FROM " + Table.TABLE_MAHASISWA + " mahasiswa INNER JOIN " + Table.TABLE_JURUSAN +
                " jurusan ON jurusan.id = mahasiswa.idJurusan " +
                "INNER JOIN  " + Table.TABLE_FAKULTAS + " fakultas ON fakultas.id = jurusan.idFakultas ";


        //ganti imi
        return jdbcTemplate.query(sql, new RowMapper<Mahasiswa>() {
            @Override
            public Mahasiswa mapRow(ResultSet rs, int rowNum) throws SQLException {
                Mahasiswa mahasiswa = new Mahasiswa();

                mahasiswa.setId(rs.getInt("id"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setTempat(rs.getString("tempat"));
                mahasiswa.setTanggal(rs.getDate("tanggal"));
                mahasiswa.setAlamat(rs.getString("alamat"));
                mahasiswa.setAyah(rs.getString("ayah"));
                mahasiswa.setIbu(rs.getString("ibu"));
                mahasiswa.setIdJurusan(rs.getInt("idJurusan"));

                Jurusan jurusan = new Jurusan();
                jurusan.setId(rs.getInt("idJurusan")); //nama_fakultas
                jurusan.setNama(rs.getString("namaJurusan"));
                jurusan.setIdFakultas(rs.getInt("idFakultas"));

                Fakultas fakultas = new Fakultas();
                fakultas.setId(rs.getInt("idFakultas"));
                fakultas.setNama(rs.getString("namaFakultas"));

                mahasiswa.setFakultas(fakultas);
                mahasiswa.setJurusan(jurusan);

                return mahasiswa;

            }
        });//sampe sini
    }

    @Override
    public Mahasiswa findById(int id) {
        String sql = "SELECT * FROM " + Table.TABLE_MAHASISWA + " WHERE id = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Mahasiswa.class), id);
        } catch (EmptyResultDataAccessException ignored) {
        }

        return null;
    }


    @Override
    public List<Mahasiswa> findByName(Mahasiswa param) {
        String sql = "SELECT * FROM " + Table.TABLE_MAHASISWA + " WHERE nama LIKE  ?";
        return jdbcTemplate.query(sql, new Object[]{"%" + param.getNama() + "%"}, new BeanPropertyRowMapper<>(Mahasiswa.class));
    }
}
