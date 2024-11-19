package com.green.madang2.manager.book;

import com.green.madang2.manager.book.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //빈등록(객체생성)
@RequiredArgsConstructor
public class BookService {
    private final BookMapper mapper;

    public int postBook(BookPostReq p) {
        return mapper.insBook(p);
    }

    public List<BookGetRes> getBookList(BookGetReq p) {
        //sIdx값 세팅
        int page = p.getPage();
        int size = p.getSize();
        int sIdx = (page - 1) * size;
        p.setStartIdx(sIdx);

        //p.setStartIdx((p.getPage() - 1) * p.getSize());
        return mapper.selBookList(p);
    }

    public int putBook(BookPutReq p) {
        return mapper.updBook(p);
    }

    public int deleteBook(BookDeleteReq p) {
        return mapper.delBook(p);
    }
}
