package com.example.my_first_rest_app.Controllers;

import com.example.my_first_rest_app.Models.Players;
import com.example.my_first_rest_app.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players/team")
public class UpdatePlayerTeam {
    @Autowired
    private PlayerService playerService;

    @PutMapping("/{discordId}/{team}")
    public Players updatePlayerTeam(String discordId, String team) {
        return playerService.updatePlayerTeam(discordId, team);
    }
}
