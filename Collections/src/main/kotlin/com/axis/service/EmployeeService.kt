package com.axis.service

import com.axis.model.Employee
import com.axis.utility.EmployeeUtil

class EmployeeService {
    var employeeUtil= EmployeeUtil()



    fun addEmployee(employee: Employee){
        var listAfterAdd=employeeUtil.employeeList(employee)
        println("employee added successfully")
        //employeeUtil.employeeDisplay()
    }
    fun getAllEmployees(){
        employeeUtil.employeeDisplay()
    }


    fun getEmployee(id:Int){
        var result= employeeUtil.findEmployee(id)
        println(result)

    }

    fun DeleteEmployeeById(id:Int){
        var result = employeeUtil.deleteEmployee(id)
        println(result)
    }


}