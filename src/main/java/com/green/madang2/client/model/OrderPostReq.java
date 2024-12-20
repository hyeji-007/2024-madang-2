package com.green.madang2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderPostReq {
    private int custId;
    private int bookId;
    @JsonIgnore
    private int orderId;
}
