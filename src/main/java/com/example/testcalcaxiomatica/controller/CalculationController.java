package com.example.testcalcaxiomatica.controller;

import com.example.testcalcaxiomatica.entity.Coefficients;
import com.example.testcalcaxiomatica.entity.Result;
import com.example.testcalcaxiomatica.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalculationController {

    private final CalculationService calculationService;

    @PostMapping
    public ResponseEntity<?> calculation(@RequestBody final Coefficients coefficients) {
        Double discriminant = calculationService.getDiscriminant(coefficients);
        if (discriminant < 0){
            return ResponseEntity.badRequest().body("Уравнение с данными коэффициентами не имеет корней");
        }
        else {
        Result result = calculationService.calculate(coefficients);
        return ResponseEntity.ok(result);}
    }


}
