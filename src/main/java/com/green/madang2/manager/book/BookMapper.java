package com.green.madang2.manager.book;

import com.green.madang2.manager.book.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int insBook(BookPostReq p);
    List<BookGetRes> selBookList(BookGetReq p);
    int updBook(BookPutReq p);
    int delBook(BookDeleteReq p);
}
