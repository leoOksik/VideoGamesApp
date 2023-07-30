package com.example.videogamesapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.videogamesapp.dto.VideoGames;

@Repository
public interface VideoGamesRepository extends CrudRepository <VideoGames, Integer> {}
