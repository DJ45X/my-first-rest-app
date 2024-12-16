package com.example.my_first_rest_app.Controllers;

import com.example.my_first_rest_app.Models.Players;
import com.example.my_first_rest_app.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players/league")
public class UpdatePlayerLeagueController {
    @Autowired
    private PlayerService playerService;

    @PutMapping("/{discordId}/{league}")
    public Players updatePlayerLeague(String discordId, String league) {
        return playerService.updatePlayerLeague(discordId, league);
    }
}
