package com.example.my_first_rest_app.Controllers;

import com.example.my_first_rest_app.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players/ban")
public class UpdatePlayerBanStatus {
    @Autowired
    private PlayerService playerService;

    @PutMapping("/{discordId}/{banStatus}")
    public void updatePlayerBanStatus(String discordId, String banStatus) {
        playerService.updatePlayerBanStatus(discordId, banStatus);
    }
}
