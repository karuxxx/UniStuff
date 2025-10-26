/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity;

/**
 *
 * @author Karux
 */
public class EmployeeTest {
    public static void main(String[] args) {
      
        Employee emp1 = new Employee("Yusra", "Mohammad", 2000.00);
        Employee emp2 = new Employee("Peshang", "Mohammad", 5000.00);

        System.out.println("NAME\t\t\tYEARLY SALARY");
        System.out.println("----\t\t\t--------------");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "\t$" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "\t$" + emp2.getYearlySalary());

      
        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        System.out.println("\n10 Percent Salary Raised!! Yoohoooo!\n");
        System.out.println("NAME\t\t\tYEARLY SALARY");
        System.out.println("----\t\t\t--------------");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "\t$" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "\t$" + emp2.getYearlySalary());
    }
}