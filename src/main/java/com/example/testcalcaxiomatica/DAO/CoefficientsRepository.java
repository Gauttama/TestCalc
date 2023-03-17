package com.example.testcalcaxiomatica.DAO;

import com.example.testcalcaxiomatica.entity.Coefficients;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoefficientsRepository extends CrudRepository<Coefficients, Long>{

}



