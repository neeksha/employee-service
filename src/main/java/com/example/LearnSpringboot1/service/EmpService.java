package com.example.LearnSpringboot1.service;

import com.example.LearnSpringboot1.request.CreateEmpReq;

public interface EmpService {

      Object create(CreateEmpReq createEmpReq);

     Object getEmpData(int empId);

}
