package by.ticketstore.entities;

import lombok.Data;

@Data
public class Genre {

    private Long id;
    private String name;

    public Genre(String name) {
        this.name = name;
    }
}