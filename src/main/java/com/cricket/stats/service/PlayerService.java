/*package com.cricket.stats.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cricket.stats.repository.PlayerRepository;
import com.cricket.stats.requests.PlayerBatting;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Iterable<PlayerBatting> list() {
        return playerRepository.findAll();
    }

    public PlayerBatting save(PlayerBatting player) {
        return playerRepository.save(player);
    }

    public void save(List<PlayerBatting> player) {
    	playerRepository.save(player);
    }
}
*/