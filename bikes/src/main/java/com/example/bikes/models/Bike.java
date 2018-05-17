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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public boolean isContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }
}

