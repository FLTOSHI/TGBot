package fltoshi.TelegramBot.response;

import fltoshi.TelegramBot.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookListResponse extends BaseResponse {
    public BookListResponse(Iterable<BookEntity> data){
        super(true, "Книги");
        this.data = data;
    }

    private Iterable<BookEntity> data;
}
