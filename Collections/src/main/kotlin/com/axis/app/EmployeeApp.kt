package com.axis.app

import com.axis.model.Employee
import com.axis.service.EmployeeService
import java.util.*

fun main(){
    var sc = Scanner(System.`in`)

    var employeeService = EmployeeService()

    /*println("add employee")
    println("enter id")
    var id=sc.nextInt()
    println("enter name")
    var name=sc.next()
    println("enter salary")
    var salary=sc.nextInt()

    var employee= Employee(id,name,salary)


    //add employee
    //employeeService.addEmployee(employee )

    //get all employees
    employeeService.getAllEmployees()

    //get employee by id
    employeeService.getEmployee(1)

    //delete employee by id

    employeeService.DeleteEmployeeById(2)

    employeeService.getAllEmployees()*/

    println("-----------MENU--------------------")
    println("1.Display all Employees\n2.Add Employee\n3.Search Employee by id\n4.Delete employee by id\n5)Exit")

    println("enter choice")
    var choice=sc.nextInt()
    while (choice <6) {
        when (choice) {
            1 -> employeeService.getAllEmployees()
            2 -> {
                println("enter id")
                var id = sc.nextInt()
                println("enter name")
                var name = sc.next()
                println("enter salary")
                var salary = sc.nextInt()
                var employee = Employee(id, name, salary)
                employeeService.addEmployee(employee)
                println("Employee added successfully")
            }

            3 -> {
                println("enter id to search employee")
                var id = sc.nextInt()
                employeeService.getEmployee(id)
            }

            4 -> {
                println("enter id to delete")
                var id = sc.nextInt()
                employeeService.DeleteEmployeeById(id)
            }

            5 -> System.exit(0)

        }
        println("------------Process completed-------------")
        println("1.Display all Employees\n2.Add Employee\n3.Search Employee by id\n4.Delete employee by id\n5)Exit")

        println("enter choice to continue")
        var ch =sc.nextInt()
        choice = ch
    }
}