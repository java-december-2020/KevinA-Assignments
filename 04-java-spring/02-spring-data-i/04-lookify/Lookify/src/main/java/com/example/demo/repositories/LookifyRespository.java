package com.example.demo.repositories;

import com.example.demo.models.Lookify;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LookifyRespository extends JpaRepository<Lookify, Long> {

    List<Lookify> findAll();
    List<Lookify> findByArtist(String artist);
    List<Lookify> deleteAllByArtist(String artist);
    List<Lookify> findAllByArtist(String artist);
    List<Lookify> findTopByRating(int rating);
    List<Lookify> findTop10ByOrderByRatingDesc();

}
