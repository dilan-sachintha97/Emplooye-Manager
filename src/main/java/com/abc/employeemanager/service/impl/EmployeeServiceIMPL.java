package com.abc.employeemanager.service.impl;

import com.abc.employeemanager.repo.EmployeeRepo;
import com.abc.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


}
