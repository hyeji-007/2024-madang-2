package com.green.madang2.client;

import com.green.madang2.client.model.OrderGetReq;
import com.green.madang2.client.model.OrderGetRes;
import com.green.madang2.client.model.OrderPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {
    int insOrders(OrderPostReq p);
    List<OrderGetRes> selOrderList(OrderGetReq p);
}
