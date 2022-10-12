package com.ll.exam.melon_exam.app.song.repository;


import com.ll.exam.melon_exam.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
