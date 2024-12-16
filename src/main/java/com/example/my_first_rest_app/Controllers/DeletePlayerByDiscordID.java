package com.example.my_first_rest_app.Controllers;

import com.example.my_first_rest_app.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players")
public class DeletePlayerByDiscordID {
    @Autowired
    private PlayerService playerService;

    @DeleteMapping("/{discordId}")
    public void deletePlayerByDiscordID(String discordId) {
        playerService.deletePlayer(discordId);
    }
}
