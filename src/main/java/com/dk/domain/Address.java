package com.dk.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
