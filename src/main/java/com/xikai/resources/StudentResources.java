package com.xikai.resources;

import com.xikai.model.Student;
import com.xikai.services.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by xikaixiong on 3/5/17.
 */

@RestController
//change to xml format not working don't figure out why
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
@RequestMapping(value = "/jerseyStudents")
public class StudentResources {
    StudentService studentService = new StudentService();

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{studentId}",method = RequestMethod.GET)
    public Student getStudent(@PathVariable("studentId") int id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/{studentId}",method=RequestMethod.PUT)
    public Student updateStudent(@PathVariable("studentId") int id, Student student) {
        student.setId(id);
        return studentService.updateStudent(student);
    }

    @RequestMapping(value="/{studentId}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("studentId") int id) {
        studentService.removeStudent(id);
    }

}
