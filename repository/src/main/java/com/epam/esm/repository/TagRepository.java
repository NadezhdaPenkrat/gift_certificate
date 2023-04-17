package com.epam.esm.repository;

import com.epam.esm.entity.Tag;

import java.util.List;
import java.util.Optional;

/**
 * The interface that shows methods
 * that uses JdbcTemplate
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
public interface TagRepository {

    List<Tag> getAll();

    Tag add(Tag tag);

    void delete(Long id);

    void insertTag(Long certificateId, Long tagId);

    Tag update(Tag tag);

    Optional<Tag> getById(Long id);

    Optional<Tag> getByName(String name);

    List<Tag> getByCertificate(Long id);

}

