package com.lyn.mapper;


import com.lyn.domain.Student;

public interface StudentMapper {
    /**
     * 根据id值查询学生信息
     * @param id
     * @return
     */
    public Student findStuById(int id);

    /**
     * 要求查询学生时，将学生选择的课程查出
     * @param id
     * @return
     */
    public Student findStuAndCou(int id);

}