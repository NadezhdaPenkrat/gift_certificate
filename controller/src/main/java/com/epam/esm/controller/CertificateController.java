package com.epam.esm.controller;

import com.epam.esm.dto.CertificateDto;
import com.epam.esm.validation.service.CertificateService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

/**
 * The class that represents
 * CertificateServiceController
 * RestController  RequestMapping
 * an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
@AllArgsConstructor
@RestController
@RequestMapping(value = "/certificates",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class CertificateController {

    private final CertificateService certificateService;

    /**
     * Create new {@linkCertificateDto} object and returns an {@linkCertificateDto} object
     *
     * @paramcertificateDto - data for creating new {@linkCertificateDto} object
     * @return created {@linkCertificateDto} object
     */
    @PostMapping
    @ResponseStatus(CREATED)
    public CertificateDto create(@RequestBody CertificateDto certificateDto) {
        return certificateService.create(certificateDto);
    }

    /**
     * Get all Certificates from database
     *
     * @return List of {@linkCertificateDto} all tCertificates
     */
    @GetMapping
    @ResponseStatus(OK)
    public List<CertificateDto> getAll() {

        return certificateService.getAll();
    }

    /**
     * Return an object {@linkCertificateDto} Certificates
     *
     * @paramid - id of {@linkCertificateDto} that has retrieved from database
     * @return {@linkCertificateDto} an object CertificateDto from database by id
     */
    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public CertificateDto getById(@PathVariable("id") Long id) {

        return certificateService.findById(id);
    }

    /**
     * Return updated {@linkCertificateDto} an object CertificateDto
     *
     * @paramcertificateDto - new data for updating an {@linkCertificateDto} object to be updated
     * @return {@linkCertificateDto} contain an updated object
     */
    @PutMapping
    @ResponseStatus(OK)
    public CertificateDto update(@RequestBody CertificateDto certificateDto) {

        return certificateService.update(certificateDto);
    }

    /**
     * Method for delete {@linkCertificateDto} from database
     *
     * @paramid - id of {@linkCertificateDto} that has to be deleted from database.
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(OK)
    public void delete(@PathVariable("id") Long id) {

        certificateService.delete(id);
    }
}
