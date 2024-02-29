package fltoshi.TelegramBot.response;

import lombok.Data;
import fltoshi.TelegramBot.entity.BookEntity;

@Data
public class BookResponse {
    private BookEntity data;

    public BookResponse(Boolean success, String message, BookEntity data){
        super();
        this.data = data;
    }
}
