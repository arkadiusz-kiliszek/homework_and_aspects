package com.example.service;

import com.example.shape.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateAreaService {

    @Autowired
    private Shape shape;

    public void calculateAreaOfSquare() {
        System.out.println("START - calculate area for " + shape.getClass());
        double area = shape.calculateArea();
        System.out.println("Finish - calculated result is  " + area);
    }
}
