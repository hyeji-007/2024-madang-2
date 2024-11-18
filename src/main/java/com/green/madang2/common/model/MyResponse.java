package com.green.madang2.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MyResponse<T> {
    private String resultMessage;
    private T resultData;
}
