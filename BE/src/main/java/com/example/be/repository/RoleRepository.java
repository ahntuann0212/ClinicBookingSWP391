package com.example.be.repository;

import com.example.be.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String>, CrudRepository<Role,String>{
	Role findByName(String name);
}
