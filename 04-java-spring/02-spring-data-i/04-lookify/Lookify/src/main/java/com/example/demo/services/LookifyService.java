package com.example.demo.services;

import com.example.demo.models.Lookify;
import com.example.demo.repositories.LookifyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;

@Service
public class LookifyService {
    @Autowired
    private LookifyRespository respository;

    public List<Lookify> findAll() {
        return respository.findAll();
    }

    public Lookify createNewMusic(Lookify newLookify) {
        return respository.saveAndFlush(newLookify);
    }

    public Lookify getSongById(long id) {
        return respository.findById(id).orElse(null);
    }

    public List<Lookify> getTopSong() {
        return respository.findTop10ByOrderByRatingDesc();
    }

    public void remove(long id) {
        Lookify lookify = this.getSongById(id);
        if (lookify.getId() != null) {
            respository.deleteById(id);
        }
    }

    public List<Lookify> findSongByArtist(String artist, Lookify lookify) {
        if (artist.equalsIgnoreCase(lookify.getArtist())) {
            return respository.findAllByArtist(artist);
        } else {
            return null;
        }
    }

}
