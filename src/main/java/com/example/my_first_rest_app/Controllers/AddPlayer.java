package com.example.my_first_rest_app.Controllers;

import com.example.my_first_rest_app.Models.Players;
import com.example.my_first_rest_app.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players")
public class AddPlayer {
    @Autowired
    private PlayerService playerService;

    @PostMapping
    public Players addPlayer(Players players) {
        return playerService.addPlayer(players);
    }
}
