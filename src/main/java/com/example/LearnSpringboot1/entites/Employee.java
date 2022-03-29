package com.example.LearnSpringboot1.entites;

import lombok.Data;

@Data
public class Employee {
    int empId;
    String name;
    String designation;
    double salary;
}
