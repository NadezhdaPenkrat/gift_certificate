package com.epam.esm.mapper;

import com.epam.esm.entity.Tag;
import lombok.Data;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
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
public class TagMapper implements RowMapper<Tag> {

    @Override
    public Tag mapRow(ResultSet rs, int rowNum) throws SQLException {

        Tag tag = new Tag();
        tag.setId(rs.getLong("id"));
        tag.setName(rs.getString("name"));

        return tag;
    }
}

