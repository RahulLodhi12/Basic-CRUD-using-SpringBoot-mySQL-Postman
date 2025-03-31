package com.example.IPL.Service;

import com.example.IPL.Entity.Player;
import com.example.IPL.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id){
        return playerRepository.findById(id).orElse(null);
    }

    public Player addPlayer(Player player){
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long id, Player updatePlayer){
        Player existingPlayer = playerRepository.findById(id).orElse(null);
        if(existingPlayer!=null){
            existingPlayer.setName(updatePlayer.getName());
            existingPlayer.setTeam(updatePlayer.getTeam());
            existingPlayer.setAge(updatePlayer.getAge());
            existingPlayer.setRuns(updatePlayer.getRuns());
            return playerRepository.save(existingPlayer);
        }
        return null;
    }

    public void deletePlayer(Long id){
        playerRepository.deleteById(id);
    }
}
