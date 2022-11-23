package com.axis.utility

import com.axis.model.Employee

class EmployeeUtil {

    var employees= mutableListOf<Employee>()

    //initializing employees list with 2 objects
    var emp1 = employees.add(Employee(1,"shreya",1000))
    var emp2 = employees.add(Employee(2,"shreya2",2000))



    fun employeeList(employee :Employee):MutableList<Employee>{

        employees.add(employee)

        return employees
    }
    fun employeeDisplay(){
        for (employee in employees){
            println("${employee.id}, ${employee.name},${employee.salary}")

        }

    }

    fun findEmployee(id:Int):String{
        for (employee in employees){
            if (employee.id == id){
                println("${employee.id}, ${employee.name},${employee.salary}")
                return "employee found"
            }
        }
        return "employee not found"


    }

    fun deleteEmployee(id:Int):String{
        for (employee in employees){
            if (employee.id == id){
                employees.remove(employee)
                return "employee deleted "
            }
        }
        return "employee not found"

    }

}