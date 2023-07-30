package com.example.videogamesapp.controller;

import com.example.videogamesapp.repository.VideoGamesRepository;
import com.example.videogamesapp.dto.VideoGames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class VideoGamesController {
    private final VideoGamesRepository videoGamesRepository;

    @Autowired
    public VideoGamesController(VideoGamesRepository videoGamesRepository) {
        this.videoGamesRepository = videoGamesRepository;
    }

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("video_games")
    public Iterable<VideoGames> getAll() {
        return videoGamesRepository.findAll();
    }

    @PostMapping("video_games")
    public VideoGames add(@RequestBody VideoGames videoGames) {
        return videoGamesRepository.save(videoGames);
    }


    @GetMapping("video_games/{id}")
    public Optional<VideoGames> get(@PathVariable Integer id) {
        return videoGamesRepository.findById(id);
    }

    @DeleteMapping("video_games/{id}")
    public void delete(@PathVariable Integer id) {
        videoGamesRepository.deleteById(id);
    }
}
