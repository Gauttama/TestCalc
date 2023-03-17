package com.example.testcalcaxiomatica.DAO;

import com.example.testcalcaxiomatica.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<Result, Long> {

}
