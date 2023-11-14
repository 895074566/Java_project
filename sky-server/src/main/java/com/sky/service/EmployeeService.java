package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO); //创建一个login对象，里面存着用户信息

    // 新增员工
    void save(EmployeeDTO employeeDTO);
    // 查看员工
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
