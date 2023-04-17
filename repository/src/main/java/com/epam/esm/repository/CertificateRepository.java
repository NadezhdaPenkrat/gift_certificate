package com.epam.esm.repository;

import com.epam.esm.entity.Certificate;
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
public interface CertificateRepository {

    Certificate add(Certificate certificate);

    Certificate update(Certificate certificate);

    Optional<Certificate> getById(Long id);

    List<Certificate> getByName(String name);

    List<Certificate> getAll();

    void delete(Certificate certificate);
}

