package org.xproce.springdatademo.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class product {
    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Date date ;
}
