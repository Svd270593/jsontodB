package com.cricket.stats.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cricket.stats.requests.PlayerBatting;


public interface PlayerRepository extends CrudRepository<PlayerBatting, Long> {

	//List<PlayerBatting> findById(String PlayerName);

	Optional<PlayerBatting> findById(Long id);
	

}
