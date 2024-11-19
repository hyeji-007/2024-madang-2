package com.green.madang2.manager.order;

import com.green.madang2.manager.order.model.OrderGetReq;
import com.green.madang2.manager.order.model.OrderGetRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderMapper mapper;

    public List<OrderGetRes> getOrderList(OrderGetReq p) {
        p.setStartIdx((p.getPage() - 1) * p.getSize());
        return mapper.selOrderList(p);
    }
}
