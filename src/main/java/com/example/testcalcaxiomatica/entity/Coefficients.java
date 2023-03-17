package com.example.testcalcaxiomatica.entity;

import jakarta.persistence.*;
import lombok.Data;


@Table(name = "t_coefficients")
@Entity
@Data
public class Coefficients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double a;
    private Double b;
    private Double c;


}
