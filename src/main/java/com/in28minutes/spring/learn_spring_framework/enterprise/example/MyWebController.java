package com.in28minutes.spring.learn_spring_framework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService(){
        return businessService.calculateSum();
    }
}

@Component
class BusinessService{
    @Autowired
    private DataSerivce dataSerivce;
    public long calculateSum(){
        List<Integer> data = dataSerivce.getData();
        return data.stream().reduce(Integer::sum).get();

    }
}

@Component

class DataSerivce{
    public List<Integer> getData(){
        return Arrays.asList(10,20,30,40);
    }
}

