package com.sashika.rest;

import com.sashika.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    CustomerDao customerDao;


    @GetMapping(value = "/customers")
    public List getHello(){
        return customerDao.list();
    }
}
