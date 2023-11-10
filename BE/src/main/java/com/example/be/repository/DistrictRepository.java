package com.example.be.repository;

import com.example.be.entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DistrictRepository extends JpaRepository<District, String>, CrudRepository<District,String>{
	@Query(value ="Select * from district   where district._province_id = :_province_id", nativeQuery=true)
	Set<District> getDistricts(@Param("_province_id") String _province_id);
}
