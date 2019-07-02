package com.lyn.test;

import com.lyn.domain.User;
import com.lyn.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class MybatisTest {
    public static SqlSessionFactory sessionFactory;

    static {
        try {
            //使用MyBatis提供的Resources类加载mybatis的配置文件
            Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
            //构建sqlSession的工厂
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //创建能执行映射文件中sql的sqlSession
    public static SqlSession getSession() {
        return sessionFactory.openSession();
    }


    /**
     * 新增用户
     */
    private static void insertUser() {
        SqlSession session = getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User("懿", "1314520", 7000.0);
        try {
            mapper.insertUser(user);
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }


    /**
     * 删除用户
     */
    private static void deleteUser() {
        SqlSession session = getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            mapper.deleteUser(1);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }


    /**
     * 根据id查询用户
     */
    private static void selectUserById() {
        SqlSession session = getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
//            User user = com.com.selectUserById(2);
            User user = mapper.selectUserById2(2, "updatename");
            System.out.println(user.toString());

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    /**
     * 查询所有的用户
     */
    private static void selectAllUser() {
        SqlSession session = getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            List<User> users = mapper.selectAllUser();
            for (User user : users) {
                System.out.println(user.toString());
            }
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    private static void updateUserById(Integer id) {
        SqlSession session = getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            User newUser = new User();
            newUser.setUsername("updatename");
            newUser.setAccount(100.0);
            newUser.setPassword("sssssa");
            newUser.setId(3);
//            com.com.updateUser(newUser);
            mapper.updateUser2(newUser);
            session.commit();

        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    public static void main(String[] args) {
//        insertUser();
//        deleteUser();
//        updateUserById(2);
        selectUserById();
//        selectAllUser();
    }

}

