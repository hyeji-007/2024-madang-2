package com.green.madang2.manager.customer;

import com.green.madang2.manager.customer.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int insCustomer(CustomerPostReq p);
    List<CustomerGetRes> selCustomerList(CustomerGetReq p);
    int updCustomer(CustomerPutReq p);
    int delCustomer(int p);
}
