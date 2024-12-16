package com.example.my_first_rest_app.Controllers;

import com.example.my_first_rest_app.Models.Players;
import com.example.my_first_rest_app.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/players")
public class GetAllPlayersController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Players> getAllPlayers() {
        return playerService.getAllPlayers();
    }
}
