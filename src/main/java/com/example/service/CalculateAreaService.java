package com.example.service;

import com.example.shape.Shape;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CalculateAreaService {

    private final Set<Shape> shape;

    public void calculateAreaOfSquare() {
//        System.out.println("START - calculate area for " + shape.getClass());
//        double area = shape.calculateArea();
//        System.out.println("Finish - calculated result is  " + area);
        Scanner scanner = new Scanner(System.in);
        System.out.println("chose one Square or rectangle");
        String chosenShape = scanner.nextLine();
        shape.stream()
                .filter(s->s.getName().equalsIgnoreCase(chosenShape))
                .forEach(Shape::calculateArea);
    }
}
