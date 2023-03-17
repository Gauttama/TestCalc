package com.example.testcalcaxiomatica.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "t_result")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Result {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @JsonIgnore
        private Long id;

        private Double x1;
        private Double x2;

}
