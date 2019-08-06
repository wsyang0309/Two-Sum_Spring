package com.example.demo.repository;

import com.example.demo.model.Number;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class NumberRepository {

    List<Number> numbers = new ArrayList<>();

    public NumberRepository() {
        Number one = Number.builder()
                .number(1)
                .build();
        Number two = Number.builder()
                .number(2)
                .build();

        numbers.add(one);
        numbers.add(two);
    }

    public List<Number> findTwoSum(String target){
        List<Number> result = new ArrayList();
        int sum = Integer.valueOf(target);
        for(int i = 0; i < numbers.size(); i++){
            for(int j = i + 1; j < numbers.size(); j++){
                if(numbers.get(i).getNumber() + numbers.get(j).getNumber() == sum){
                    result.add(numbers.get(i));
                    result.add(numbers.get(j));
                    return result;
                }
            }
        }
        return result;
    }

}
