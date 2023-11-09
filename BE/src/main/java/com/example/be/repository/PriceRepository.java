package com.example.be.repository;

import com.example.be.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, String>, CrudRepository<Price, String> {
	@Query(value ="Select * from price where  price.id_clinic = :id_clinic", nativeQuery=true)
	List<Price> getPricesClinic(@Param("id_clinic") String id_clinic);
}
