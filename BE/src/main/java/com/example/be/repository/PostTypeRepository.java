package com.example.be.repository;

import com.example.be.entities.PostType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTypeRepository extends JpaRepository<PostType, String>, CrudRepository<PostType, String> {

}
