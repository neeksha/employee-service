package com.example.LearnSpringboot1.controller;

import com.example.LearnSpringboot1.request.CreateEmpReq;
import com.example.LearnSpringboot1.request.UpdateEmpReq;
import com.example.LearnSpringboot1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmpService empService;

    @GetMapping("/read")
    public Object read(@RequestParam("empId") int empId) {
        System.out.println("read");
        Object res = empService.getEmpData(empId);

        return res;
    }

    @PostMapping("/save")
    public Object save(@RequestBody CreateEmpReq createEmpReq) {
        System.out.println("Create Employee Request" + createEmpReq);
        Object response=empService.create(createEmpReq);
        return response;
    }

    @PutMapping("/{empID}/update")
    public Object update(@PathVariable("empID") String empId, @RequestBody UpdateEmpReq updateEmpReq) {
        System.out.println("hi");
        return null;
    }

    @DeleteMapping("/{empId}/delete")
    public Object delete(@PathVariable("empId") String empId) {
        System.out.println("delete");
        return null;
    }

}