package com.myj.study.test;

import com.myj.study.entity.User;
import com.myj.study.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MYJ on 2018/1/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSave(){
        User user=new User("姓名4",25,"040");
        int num=userMapper.save(user);
        System.out.println(num);
    }

    @Test
    public void testUpdateById(){
        User user=new User(2,"更新后姓名",25,"021");
        int num=userMapper.updateById(user);
        System.out.println(num);
    }

    @Test
    public void deleteById(){
        int num=userMapper.deleteById(1);
        System.out.println(num);
    }
    
    @Test
    public void selectById(){
        User user = userMapper.selectById(2);
        System.out.println(user.toString());
    }

    @Test
    public void queryAll(){
        List<User> listUser = userMapper.queryAll();
        for(User user : listUser){
            System.out.println(user.toString());

        }
    }

    @Test
    public void queryAllMap(){
        Map<String,Object> param=new HashMap<>();
        param.put("idGt",2);
        List<Map<String, Object>> listUser = userMapper.queryAllMap(param);
        System.out.println(listUser);
    }

}
