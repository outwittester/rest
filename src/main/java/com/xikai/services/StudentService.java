package com.xikai.services;

import com.xikai.database.DatabaseClass;
import com.xikai.model.Student;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xikaixiong on 3/5/17.
 */

@WebService
public class StudentService {
    Map<Integer,Student> students = DatabaseClass.getStudents();

    public StudentService() {
        students.put(1, new Student(1,"xikai1","chess",9733683772L));
        students.put(2, new Student(2,"xikai2","chess2",9733683773L));
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public Student addStudent(Student student) {
        student.setId(students.size() + 1);
        students.put(student.getId(), student);
        return student;
    }

    public Student updateStudent(Student student) {
        if(student.getId()<=0){
            return null;
        }
        students.put(student.getId(), student);
        return student;
    }

    public Student removeStudent(int id) {
        return students.remove(id);
    }
}
