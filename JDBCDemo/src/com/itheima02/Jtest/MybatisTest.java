package com.itheima02.Jtest;

import com.itheima02.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        // 加载核心配置文件
        String resource = "SQLMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);

        // 创建SqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(in);

        // 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 执行sql语句
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);

        // 查询多个user
        List<User> users = sqlSession.selectList("test.findUserByUsername", '徐');

        // 插入数据
        User user2 = new User();
        user2.setSex("男");
        user2.setUsername("XKC");
        int i =sqlSession.insert("test.insertUser", user);   // i 影响多少行

        // 提交事务
        sqlSession.commit();

        // 获取插入的id, user的id被SQL语句赋值, 直接getID()
        int id = user.getId();
        System.out.println(id);


    }

}
