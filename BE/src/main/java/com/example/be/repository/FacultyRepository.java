package com.example.be.repository;

import com.example.be.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, String>, CrudRepository<Faculty,String>{
	Set<Faculty> findByIdIn(List<String> facultyIds);
}
