package com.huangpf.dao;

import com.huangpf.po.UserT;

public interface UserTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_T
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_T
     *
     * @mbggenerated
     */
    int insert(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_T
     *
     * @mbggenerated
     */
    int insertSelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_T
     *
     * @mbggenerated
     */
    UserT selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_T
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_T
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserT record);
}