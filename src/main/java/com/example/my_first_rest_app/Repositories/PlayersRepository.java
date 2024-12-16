package com.example.my_first_rest_app.Repositories;

import com.example.my_first_rest_app.Models.Players;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayersRepository extends JpaRepository<Players, Long> {
    Optional<Players> findByDiscordId(String discordId);
}
