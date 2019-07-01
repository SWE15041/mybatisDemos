package com.lyn.domain;


import java.io.Serializable;
import java.util.List;


/**
 * manyTOmany
 *
 * @author acer
 */
public class Courses implements Serializable {


    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    // 使用 List<Student>集合，是说明学习这门课程的所有学生
    private List<Student> student;

    public Courses() {
        super();
    }

    public Courses(Integer id, String name, List<Student> student) {
        super();
        this.id = id;
        this.name = name;
        this.student = student;
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

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Courses [id=" + id + ", name=" + name + ", student="
                + student + "]";
    }


}