package org.example;

import static org.junit.Assert.assertTrue;

import mapper.DeptMapper;
import mapper.EmpMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Dept;
import pojo.Emp;
import pojo.User;
import utils.SqlSessionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void myBatisUserTest() throws Exception {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class); //生成代理实现类

//        User user = new User(0, "lpc10", "123456", null);
//
//        mapper.insertUser(user);
//
//        System.out.println(user.getId());

        sqlSession.commit();

        System.out.println(mapper.selectUserById(1));

//        System.out.println(mapper.selectToMap());


    }

    @Test
    public void myBatisEmpTest() throws Exception {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);

        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

//        System.out.println(empMapper.selectEmpAndDeptById(2));
//        mapper.selectAll().forEach(System.out::println);
//        System.out.println(mapper.selectOneById(4).getDept().getDeptName());
        System.out.println(deptMapper.selectDeptAndEmp(1));


    }
}
