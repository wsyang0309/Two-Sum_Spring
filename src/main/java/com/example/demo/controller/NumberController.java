package com.example.demo.controller;

import com.example.demo.model.Number;
import com.example.demo.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping
@RestController
public class NumberController {
    @Autowired
    NumberService numberService;

    @GetMapping(path="/{inputString}", produces = "application/json")
    public HttpEntity<Number> searchTwoSum(@PathVariable("inputString") String inputString){

        List<Number> foundNumbers = numberService.findTwoSum(inputString);

        return new ResponseEntity(foundNumbers, HttpStatus.OK);
    }

}
