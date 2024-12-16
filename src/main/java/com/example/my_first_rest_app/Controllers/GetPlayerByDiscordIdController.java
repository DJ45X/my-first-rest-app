package com.example.my_first_rest_app.Controllers;

import com.example.my_first_rest_app.Models.Players;
import com.example.my_first_rest_app.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players")
public class GetPlayerByDiscordIdController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/{discordId}")
    public Players getPlayerByDiscordId(String discordId) {
        return playerService.getPlayerByDiscordId(discordId);
    }
}
