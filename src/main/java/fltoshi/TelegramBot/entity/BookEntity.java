package fltoshi.TelegramBot.entity;

import lombok.Data;

@Data
public class BookEntity {
    private Long id;
    private String title;
    private String author;
    private String publishing;
    private Integer year;
    private String kind;
}