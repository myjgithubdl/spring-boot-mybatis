package com.myj.study.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by MYJ on 2018/1/16.
 */
public interface IBaseDao<T> {

    /**
     *
     * @param t
     * @return
     */
    int save(T t);

    /**
     *  修改
     * @param t
     * @return
     */
    int updateById(T t);

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
    T selectById(Integer id);

    /**
     *  查询
     * @return
     */
    List<T> queryAll();

    /**
     * 查询作为List<Map<String,Object>>返回
     * @param param
     * @return
     */
    List<Map<String,Object>> queryAllMap(Map<String,Object> param);
}
