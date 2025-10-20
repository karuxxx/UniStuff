/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentclass;

/**
 *
 * @author Karux
 */
public class student {
    private String name;
    private int ID;
    private int semester;
    private String department;
    private static int nextID = 1;

    public student(String name, String department, int semester) {
        this.name = name;
        this.department = department;
        this.semester = semester;
        this.ID = nextID++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public void display() {
        System.out.println("Student ID: " + ID);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
    }
}