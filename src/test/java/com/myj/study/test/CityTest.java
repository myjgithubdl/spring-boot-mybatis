package com.myj.study.test;

import com.myj.study.entity.City;
import com.myj.study.mapper.CityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by MYJ on 2018/1/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityTest {

    @Autowired
    private CityMapper cityMapper;

    @Test
    public void insert(){
        City city=new City();
        city.setCityId(1292);
        city.setCityName("广州");
        city.setCityPy("guangzhou");
        city.setProvId(29);
        city.setCityState("1");
        int num=cityMapper.insert(city);
        System.out.println(num);
    }

    @Test
    public void update(){
        City city=new City();
        city.setCityId(1292);
        city.setCityName("广州");
        city.setCityPy("guangzhou");
        city.setProvId(29);
        city.setCityState("1");
        int num=cityMapper.update(city);
        System.out.println(num);
    }

    @Test
    public void delete(){
        City city=new City();
        city.setCityId(1292);
        city.setCityName("广州");
        city.setCityPy("guangzhou");
        city.setProvId(29);
        city.setCityState("1");
        int num=cityMapper.delete(city);
        System.out.println(num);
    }

    @Test
    public void findByCityId(){
        City city=cityMapper.findByCityId(1292);
        System.out.println(city);
    }

    @Test
    public void queryAllToListMap(){
        List<Map<String, Object>> list = cityMapper.queryAllToListMap();
        System.out.println(list);
    }

}
