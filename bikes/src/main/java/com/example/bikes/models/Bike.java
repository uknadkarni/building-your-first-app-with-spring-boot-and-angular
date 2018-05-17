package com.example.bikes.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;

//    @JsonFormat(pattern = "MM-DD-yyyy", shape = JsonFormat.Shape.STRING)
//    private Date purchaseDate;
    private boolean contact;
}

