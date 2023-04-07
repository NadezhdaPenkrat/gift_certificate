package com.epam.esm.mapper;

import com.epam.esm.entity.Certificate;
import lombok.Data;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
/**
 * The class that uses a JdbcTemplate  RowMapper
 * to display the rows of the ResultSet
 * for each row.
 * Implementations of this interface
 * do the actual work of mapping each row
 * to a result object
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
@Data
@Component
public class CertificateMapper implements RowMapper<Certificate> {

    @Override
    public Certificate mapRow(ResultSet rs, int rowNum) throws SQLException {

        Certificate certificate = new Certificate();
        certificate.setId(rs.getLong("id"));
        certificate.setName(rs.getString("name"));
        certificate.setDescription(rs.getString("description"));
        certificate.setPrice(rs.getBigDecimal("price"));
        certificate.setDuration(rs.getInt("duration"));
        certificate.setCreateDate(ZonedDateTime.ofInstant(rs.getTimestamp("create_date")
                .toInstant(), ZoneOffset.UTC).toLocalDateTime());
        certificate.setUpdateDate(ZonedDateTime.ofInstant(rs.getTimestamp("last_update_date")
                .toInstant(), ZoneOffset.UTC).toLocalDateTime());

        return certificate;
    }
}

