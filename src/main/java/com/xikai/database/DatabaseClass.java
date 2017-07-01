package com.xikai.database;

import com.xikai.model.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xikaixiong on 3/5/17.
 */
public class DatabaseClass {

    private static Map<Integer, Student> students = new HashMap<>();

    public static Map<Integer, Student> getStudents() {
        return students;
    }



}
