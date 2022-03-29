package com.example.LearnSpringboot1.service.impl;

import com.example.LearnSpringboot1.entites.Employee;
import com.example.LearnSpringboot1.request.CreateEmpReq;
import com.example.LearnSpringboot1.responce.EmpResponce;
import com.example.LearnSpringboot1.service.EmpService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {
    static int globalId = 1;
    static Map<Integer, Employee> map = new HashMap<Integer, Employee>();

    @Override
    public Object create(CreateEmpReq createEmpReq) {
        Employee employee = new Employee();

        employee.setName(createEmpReq.getName());
        employee.setDesignation(createEmpReq.getDesignation());
        employee.setSalary(createEmpReq.getSalary());
        int id = globalId++;
        employee.setEmpId(id);
        map.put(id, employee);

        System.out.println(createEmpReq);
        return id;
    }

    @Override
    public Object getEmpData(int empId) {

        Employee e = map.get(empId);
        EmpResponce empResponce = EmpResponce.builder().desgination(e.getDesignation())
                .name(e.getName()).build();
        return empResponce;
    }
}
