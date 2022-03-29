package com.example.LearnSpringboot1.request;

import lombok.Data;

@Data
public class UpdateEmpReq {

    String name;
    String designation;
    double salary;
}
