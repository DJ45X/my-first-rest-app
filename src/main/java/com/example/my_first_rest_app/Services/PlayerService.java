package com.example.my_first_rest_app.Services;

import com.example.my_first_rest_app.Enums.Leagues;
import com.example.my_first_rest_app.Enums.Teams;
import com.example.my_first_rest_app.Models.Players;
import com.example.my_first_rest_app.Repositories.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.MissingResourceException;

@Service
public class PlayerService {
    @Autowired
    private PlayersRepository playersRepository;

    public List<Players> getAllPlayers() {
        return playersRepository.findAll();
    }

    public Players getPlayerByDiscordId(String discordId) {
        return playersRepository.findByDiscordId(discordId).orElseThrow(() -> new MissingResourceException("Players", discordId,"Player not found"));
    }

    public Players addPlayer(Players players) {
        return playersRepository.save(players);
    }

    public Players updatePlayerLeague(String discordId, String league) {
        Players player = getPlayerByDiscordId(discordId);
        player.setLeague(Leagues.valueOf(league).getName());
        return playersRepository.save(player);
    }

    public Players updatePlayerTeam(String discordId, String team) {
        Players player = getPlayerByDiscordId(discordId);
        player.setTeam(Teams.valueOf(team).getName());
        return playersRepository.save(player);
    }

    public void updatePlayerBanStatus(String discordId, Boolean isBanned) {
        Players player = getPlayerByDiscordId(discordId);
        player.setIsBanned(isBanned);
        playersRepository.save(player);
    }

    public void deletePlayer(String discordId) {
        playersRepository.delete(getPlayerByDiscordId(discordId));
    }
}
