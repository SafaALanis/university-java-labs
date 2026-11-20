/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;
public class Employee {
private String name ;
private double salary;
public Employee(String name , double salary){
    this.name=name;
    this.salary=salary;
}
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    /*   دالة لزيادة الراتب بنسبة مئوية 
     Increase salary by percentage */
    public void raise(double percentage){
        salary = salary + (salary* (percentage/100));
    }
    public void print(){
        System.out.println(name+"  "+salary);
    }
    public static void main(String[] args) {
       Employee E= new Employee("ali", 1000);
       E.print();
       E.raise(10);
       E.print();      }
    
}
