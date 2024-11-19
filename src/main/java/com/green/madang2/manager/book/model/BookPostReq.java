package com.green.madang2.manager.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookPostReq {
    @Schema(title = "도서 이름")
    private String bookName;
    @Schema(title = "출판사 이름")
    private String publisher;
    @Schema(title = "도서 가격")
    private int price;
}
