package org.example;

import static org.junit.Assert.assertTrue;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.DeptMapper;
import mapper.EmpMapper;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Emp;
import pojo.User;
import utils.SqlSessionUtils;

import java.io.InputStream;
import java.util.List;

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

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder1 = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder1.build(is);

        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);



//        User user = new User(0, "lpc10", "123456", null);
//
//        mapper.insertUser(user);
//
//        System.out.println(user.getId());

//        sqlSession.commit();

//        System.out.println(mapper.selectUserById(1));

//        System.out.println(mapper.selectToMap());

//        System.out.println(mapper.selectUserByManyCondition(new User(null,null,"258369",null)));
//        System.out.println(mapper.selectUserByChoose(new User(null,null,"258369",null)));
//        System.out.println(mapper.deleteById(new Integer[]{11, 12}));

        /*
        一级缓存：SqlSession级别
        失效原因：
        1、使用了不同的 SqlSession
        2、执行了不同的查询条件
        3、两次查询之间执行了更新操作
        4、两次查询之间手动清除了缓存 sqlSession.clearCache();

        二级缓存：SqlSessionFactory级别
        在核心配置文件中默认开启cacheEnabled = true
        在映射文件中添加 <cache/>
        实体类实现序列化接口
        在关闭或提交SqlSession后生效 SqlSession.close()
        失效原因：
        两次查询之间执行了更新操作

        优先查询二级缓存
         */
        System.out.println(mapper1.selectToMap());
        sqlSession1.close();
        System.out.println(mapper2.selectToMap());
        sqlSession2.close();


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


    /*
    limit：index,size
    index: 起始索引
    size：每一页数据量
    pageNum: 页码
    index = (pageNum - 1) * size
     */
    @Test
    public void myPagerTest() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        PageHelper.startPage(1,4);

        List<User> users = mapper.selectUserByManyCondition(new User(null, null, null, null));

        PageInfo<User> pageInfo = new PageInfo<>(users,2);
        System.err.println(pageInfo);


    }
}
