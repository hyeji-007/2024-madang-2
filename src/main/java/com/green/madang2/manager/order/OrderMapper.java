package com.green.madang2.manager.order;

import com.green.madang2.manager.order.model.OrderGetReq;
import com.green.madang2.manager.order.model.OrderGetRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<OrderGetRes> selOrderList(OrderGetReq p);
}
