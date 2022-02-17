package com.example.demo.Repository;

import com.example.demo.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song,String> {

}
