package com.example.videogamesapp.dto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="games_t")
@Data
@NoArgsConstructor
public class VideoGames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name_f", nullable = false)
    private String name;

    @Column(name="genre_f", nullable = false)
    private String genre;

    @Column(name="developer_f", nullable = false)
    private String developer;

    @Column(name="year_f", nullable = false)
    private Integer year;
}
