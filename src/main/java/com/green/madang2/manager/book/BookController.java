package com.green.madang2.manager.book;

import com.green.madang2.common.model.MyResponse;
import com.green.madang2.manager.book.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor //final이 붙은 멤버필드의 생성자를 만들어준다.
@RestController
@RequestMapping("manager/book")
@Tag(name = "도서", description = "도서 API")
public class BookController {

    private final BookService service;

    @PostMapping
    @Operation(summary = "도서 입고", description = "<div>도서 입고 처리 API</div>" +
                "<div>하하하하</div>")
    public MyResponse<Integer> postBook(@RequestBody BookPostReq p) {
        log.info("BookPostReq : {}", p);
        log.warn("warn");
        log.error("error");

        return new MyResponse<>("책 등록 완료", service.postBook(p));
    }

    @GetMapping
    @Operation(summary = "도서 리스트", description = "도서 정보 리스트<br> 보기 API")
    public MyResponse<List<BookGetRes>> getBookList(@ParameterObject @ModelAttribute BookGetReq p) {
        return new MyResponse<>(p.getPage() + "페이지 데이터", service.getBookList(p));
    }

    @PutMapping
    @Operation(summary = "도서 수정")
    public MyResponse<Integer> putBook(@RequestBody BookPutReq p) {
        return new MyResponse<>(p.getBookId() + "번 도서 수정", service.putBook(p));
    }

    @DeleteMapping
    @Operation(summary = "도서 삭제")
    public MyResponse<Integer> deleteBook(@ParameterObject @ModelAttribute BookDeleteReq p) {
        return new MyResponse<>(p.getBookId() + "번 도서 삭제", service.deleteBook(p));
    }
}
