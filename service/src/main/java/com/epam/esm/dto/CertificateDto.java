package com.epam.esm.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
/**
 * The class that represents pattern
 * Data Transfer Object (DTO)
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
@Data
public class CertificateDto {

    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private Integer duration;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private LocalDateTime create;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private LocalDateTime update;
    private List<TagDto> tags;

}

