package com.example.be.repository;

import com.example.be.entities.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface DegreeRepository extends JpaRepository<Degree, String>, CrudRepository<Degree,String>{
	
	Set<Degree> findByIdIn(List<String> userIds);
}
