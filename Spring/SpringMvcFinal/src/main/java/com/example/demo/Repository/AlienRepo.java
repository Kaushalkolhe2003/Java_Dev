package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Alien;

@Repository
public interface AlienRepo extends JpaRepository<Alien, Integer>{

	
	@Query("from Alien where name= :aname")
	List<Alien> findByName(@Param("aname")String string);

}
