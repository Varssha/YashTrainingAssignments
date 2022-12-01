package com.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.Classroom;

@Repository
public interface ClassroomRepository extends CrudRepository<Classroom,String>{

}
