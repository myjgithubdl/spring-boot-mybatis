package com.myj.study.mapper;

import com.myj.study.entity.City;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by MYJ on 2018/1/16.
 */
@Mapper
public interface CityMapper {

    /**
     * 插入
     * @param city
     * @return
     */
    @Insert("INSERT INTO t_city(city_id,city_name,city_py , prov_id , city_state) " +
            "VALUES(#{cityId}, #{cityName}, #{cityPy} , #{provId} , #{cityState} )")
    int insert(City city);

    /**
     * 修改
     * @param city
     * @return
     */
    @Update("UPDATE t_city SET city_name=#{cityName} , city_py=#{cityPy} ,prov_id=#{provId} ,city_state=#{cityState}  " +
            "WHERE city_id=#{cityId}")
    int update(City city);

    @Delete("DELETE FROM t_city WHERE city_id =#{cityId}")
    int delete(City city);

    /**
     * 查询
     * @param cityId
     * @return
     */
    @Select("SELECT * FROM t_city WHERE city_id = ${cityId}")
    @Results({
            @Result(property = "id",  column = "id", javaType = Integer.class),
            @Result(property = "cityId",  column = "city_id", javaType = Integer.class),
            @Result(property = "cityName",  column = "city_name", javaType = String.class),
            @Result(property = "cityPy",  column = "city_py", javaType = String.class),
            @Result(property = "provId",  column = "prov_id", javaType = Integer.class),
            @Result(property = "cityState", column = "city_state", javaType = String.class)
    })
    City findByCityId(@Param("cityId") Integer cityId);

    /**
     * 查询将结果返回为
     * @return
     */
    @Select("SELECT * FROM t_city ")
    //@ResultType(Map.class)  /*可有可无*/
    List<Map<String , Object>> queryAllToListMap();

}
