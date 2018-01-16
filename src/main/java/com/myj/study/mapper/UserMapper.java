package com.myj.study.mapper;

import com.myj.study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by MYJ on 2018/1/16.
 */
@Mapper
public interface UserMapper {
    /**
     *  插入  在XML配置文件中必须存在id为com.myj.study.mapper.UserMapper.save的insert SQL语句
     * @param user
     * @return
     */
    int save(User user);

    /**
     *  修改
     * @param user
     * @return
     */
    int updateById(User user);

    /**
     *  删除
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     *  查询
     * @param id
     * @return
     */
    User selectById(Integer id);

    /**
     *  查询
     * @return
     */
    List<User> queryAll();

    /**
     * 查询作为List<Map<String,Object>>返回
     * @param param
     * @return
     */
    List<Map<String,Object>> queryAllMap(Map<String,Object> param);
}
