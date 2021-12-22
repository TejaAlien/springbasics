package com.springbasics.springbasics.service;

import com.springbasics.springbasics.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Studentservioce {
    private static List<Student> list = new ArrayList<>();
    static {
        list.add(new Student("Ravi",23));
        list.add(new Student("teja",34));

    }
    public List<Student> getstudents(){
        return list;
    }
}
