package com.lyn.mapper;


import com.lyn.domain.Courses;

public interface CoursesMapper {

    /**
     * 根据id查询课程
     *
     * @param id
     * @return
     */
    public Courses findCouById(int id);

    /**
     * 要求查课时，将选课的学生一并查出
     *
     * @param id
     * @return
     */
    public Courses findCouAndStu(int id);


}