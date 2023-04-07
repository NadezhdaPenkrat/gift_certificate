package com.epam.esm.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
/**
 * The class that represents entity
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
@Data
public class Certificate {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer duration;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private List<Tag> tags;


}
