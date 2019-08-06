package com.example.demo.service;

import com.example.demo.model.Number;
import com.example.demo.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class NumberService {

    @Autowired
    NumberRepository numberRepository;

    public List<Number> findTwoSum(String input){
        return numberRepository.findTwoSum(input);
    }


}
