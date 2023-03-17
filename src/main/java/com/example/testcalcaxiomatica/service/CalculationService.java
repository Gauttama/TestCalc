package com.example.testcalcaxiomatica.service;

import com.example.testcalcaxiomatica.entity.Coefficients;
import com.example.testcalcaxiomatica.DAO.CoefficientsRepository;
import com.example.testcalcaxiomatica.DAO.ResultRepository;
import com.example.testcalcaxiomatica.entity.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CalculationService {
    private final CoefficientsRepository coefficientsRepository;
    private final ResultRepository resultRepository;


    public Result calculate(Coefficients coefficients) {

        coefficientsRepository.save(coefficients).getId();
        Double discriminant = getDiscriminant(coefficients);
        Double a = coefficients.getA();
        Double b = coefficients.getB();
        Double c = coefficients.getC();
        Double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        Double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        Result result = Result.builder()
                .x1(x1)
                .x2(x2)
                .build();
        resultRepository.save(result).getId();
        return result;


    }

    public Double getDiscriminant(Coefficients coefficients) {

        Double a = coefficients.getA();
        Double b = coefficients.getB();
        Double c = coefficients.getC();
        return   b * b - 4 * a * c;
    }
}
