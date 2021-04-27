package com.company.StudentTeacher;

public class Student extends Person{
    private int numCourses = 0;
    private String[] courses = new String[3];
    private int[] grades = new int[3];

    public Student(){

    }
    public Student(String name, String address){
        super(name, address);
    }
    @Override
    public String toString(){
        return "Student{" + "name=" + super.getName() + ", address=" + super.getAddress() + "}";
    }
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    public void printGrades(){
        for(int grade: grades)
            System.out.println(grade);
    }
    public double getAverageGrade(){
        int sum = 0;
        for(int grade: grades) sum += grade;
        return sum / grades.length;
    }
}
