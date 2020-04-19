package com.xikai.controller;

import com.xikai.editor.StudentNameEditor;
import com.xikai.model.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xikaixiong on 2/17/17.
 */




@Controller
@EnableWebMvc
public class StudentController {
    @InitBinder
    public void InitBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields(new String[]{"studentMobile"});
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Type.class is because the modifier before each filed
        webDataBinder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
         webDataBinder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
    }

//    @RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
//    public ModelAndView helloWorld() throws Exception {
//        String exceptionOccured = "ARITHMETIC_EXCEPTION";
//        if (exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
//            throw new NullPointerException("Null Pointer Exception");
//        } else if (exceptionOccured.equalsIgnoreCase("IOException")) {
//            throw new IOException("IO Exception");
//        }else if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")){
//            throw new ArithmeticException("Arithmetic Exception");
//        }
//        ModelAndView modelAndView = new ModelAndView("hello");
//        return modelAndView;
//    }
    @RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
    public ModelAndView helloWorld()  {
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }
    @ModelAttribute
    public void commonMessages(Model model) {
        model.addAttribute("message", "hello from  is going to be an expert of java and spring hibernate.");
        model.addAttribute("headerMessage", "this is hearder message");
        model.addAttribute("messageHi", "what are you doing here? i know who your are");
    }

    @RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
    public ModelAndView hiWorld(@Valid @ModelAttribute("student1") Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("hello");

            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("hi");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value="/students",method = RequestMethod.GET)
    public ArrayList<Student> getStudentList() {
        Student student1 = new Student();
        student1.setStudentName("student1Name");
        Student student2 = new Student();
        student2.setStudentName("student2Name");
        Student student3 = new Student();
        student3.setStudentName("student3Name");
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        return studentsList;
    }
}
