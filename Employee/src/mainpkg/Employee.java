/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Employee {
    
    private int id;
    private String name,gen,dept,desig;
    private float salary;
    private LocalDate dob,doj;

    public Employee(int id, String name, String gen, String dept,  float salary, String desig, LocalDate dob, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.gen = gen;
        this.dept = dept;
        this.desig = desig;
        this.salary = salary;
        this.dob = dob;
        this.doj = doj;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return  "id " + id + ", name " + name + ", gen " + gen + ", dept " + dept + ", salary " + salary +", desig " + desig +  ", dob " + dob + ", doj " + doj + "\n";
    }
    
    
    
}
