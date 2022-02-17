package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class Song {
    @Id
    private String Id;
    public String musicFileName;
    public String imageFileName;
    public String title;
    public String artistName;
    public String Genre;
    public String category;
    public String mood;
    public boolean isFavorited;
}
