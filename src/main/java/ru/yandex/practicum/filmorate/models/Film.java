package ru.yandex.practicum.filmorate.models;

import lombok.Data;

import java.time.Duration;
import java.time.LocalDate;

/**
 * Film.
 */
@Data
public class Film {
    private Long id;
    private String name;
    private String description;
    private LocalDate releaseDate;
    private Duration duration;

    public Film(String name, String description, LocalDate releaseDate, Duration duration) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

    public Film(Long id, String name, String description, LocalDate releaseDate, Duration duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }
}
