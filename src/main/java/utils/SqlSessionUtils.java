package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * IntelliJ IDEA-2020.1
 *
 * @ClassName: SqlSessionUtils
 * @Date: 2023/08/18/12:11
 * @Author: 李鹏程
 * @Description:
 */
public class SqlSessionUtils {

    public static SqlSession getSqlSession() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        return sqlSession;
    }
}
