package com.company.StudentTeacher;

public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Maria");
        s1.setAddress("Japan");
        System.out.println(s1.toString());
        Student s2 = new Student("Asa", "Tokyo");
        System.out.println(s2.toString());
        s1.addCourseGrade("OOP", 90);
        s1.addCourseGrade("DS", 50);
        s1.addCourseGrade("Math", 50);
        s1.printGrades();
        System.out.println(s1.getAverageGrade());
    }
}
