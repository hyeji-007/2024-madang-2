package com.green.madang2.manager.customer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.BindParam;

//immutable 객체
@Getter
@ToString
public class CustomerGetReq {

    public CustomerGetReq(int page, int size, @BindParam("search_type") String searchType, @BindParam("search_text") String searchText) {
        this.page = page;
        this.size = size;
        this.searchType = searchType;
        this.searchText = searchText;
        this.startIdx = (page - 1) * size;
    }

    @Schema(description = "page값", )
    private int page;
    private int size;
    private int startIdx;
    private String searchType;
    private String searchText;
}
