package com.lyn.service;


import com.lyn.domain.Courses;
import com.lyn.domain.Student;
import com.lyn.mapper.CoursesMapper;
import com.lyn.mapper.StudentMapper;
import com.lyn.util.DBTools;
import org.apache.ibatis.session.SqlSession;

public class ManyToManyService {


    public static void main(String[] args) {

        findStudentByCourses();
        findCoursesByStudent();
    }


    private static void findCoursesByStudent() {
        SqlSession session = DBTools.getSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);
        Student sb = sm.findStuAndCou(1);
        System.out.println(sb);

    }


    private static void findStudentByCourses() {
        SqlSession session = DBTools.getSession();
        CoursesMapper cm = session.getMapper(CoursesMapper.class);
        Courses cb = cm.findCouAndStuByCourseId(2);
        System.out.println(cb);
    }

}