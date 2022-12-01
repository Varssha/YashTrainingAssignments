package com.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.Trainee;

@Repository
public interface TraineeRepository extends CrudRepository<Trainee,Integer>{

}
