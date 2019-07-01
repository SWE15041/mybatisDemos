package com.lyn.domain;

import java.io.Serializable;
import java.util.List;


/**
 * manyTOmany
 *
 * @author acer
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private List<Courses> courses;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(Integer id, String name, List<Courses> courses) {
        super();
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", courses="
                + courses + "]";
    }


}