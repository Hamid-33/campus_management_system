package com.campus.services;
import java.util.ArrayList;
import java.util.List;
public class StudentService {
    private static final List<String> students=new ArrayList<>();

    public StudentService() {
        students.add("101 - Bob - Java");
        students.add("102 - Alice - Python");
        students.add("103 - John - C++");
    }

    public List<String> getStudents() {
        return students;
    }
    public void addStudent(String name, String course) {
        students.add(String.valueOf(students.size() + 101) + " - " + name + " - " + course);
    }
}
