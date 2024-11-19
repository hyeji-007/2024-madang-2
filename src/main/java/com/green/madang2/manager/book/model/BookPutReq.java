package com.green.madang2.manager.book.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookPutReq {
    private int bookId;
    private String bookName;
    private String publisher;
    private Integer price;
}
