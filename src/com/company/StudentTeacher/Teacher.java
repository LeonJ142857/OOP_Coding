package com.company.StudentTeacher;

public class Teacher extends Person{
    private int numCourses = 0;
    private String[] courses = new String[3];
    public Teacher(){
    }
    public Teacher(String name, String address){
        super(name, address);
    }
    @Override
    public String toString(){
        return "Teacher{" + "name=" + super.getName() + ", address=" +super.getAddress() + "}";
    }

    public boolean addCourse(String course){
        for(String c : courses) if(c.equals(course)) return false;
        courses[numCourses] = course;
        return true;
    }

    public boolean removeCourse(String course){
        boolean valid = false;
        for(String c : courses) if(c.equals(course)){
            valid = true;
            break;
        }
        if(valid){
            for(int i = 0; i < courses.length-1; ++i){
                courses[i] = courses[i+1];
                valid = true;
            }
        }
        return valid;
    }


}
