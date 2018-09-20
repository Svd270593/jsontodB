package com.cricket.stats.controller;

import com.cricket.stats.repository.PlayerRepository;
import com.cricket.stats.requests.*;
//import com.cricket.stats.service.PlayerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {
/*	@Autowired
    private PlayerService playerService;*/
    
    @Autowired
	private PlayerRepository playerRepository;
    
/*    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/list")
    public Iterable<PlayerBatting> list() {
        return playerService.list();
    }
    */
    @PostMapping(path ="/update/data")
    public @ResponseBody PlayerBatting updatePlayerData(@RequestBody PlayerBatting p) {
    	Optional<PlayerBatting> batting = playerRepository.findById(p.getId());
		if(batting.isPresent()) {
			batting.get().setPlayername(p.getPlayername());
			
			}			
		return playerRepository.save(batting.get());
    }
}
