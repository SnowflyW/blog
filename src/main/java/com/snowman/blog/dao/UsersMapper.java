package com.snowman.blog.dao;

import com.snowman.blog.model.Users;
import com.snowman.blog.utils.BlogException;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by SnowMan on 2017/7/9.
 */
@Repository
public interface UsersMapper {
    /**
     * 保存用户
     * @param params
     * @return
     */
    public int saveRecord(Map<String,Object> params) throws BlogException;

    /**
     * 更新用户
     * @param params
     * @return
     */
    public int updateRecord(Map<String,Object> params) throws BlogException;

    /**
     * 删除用户
     * @param params
     * @return
     */
    public int deleteRecord(Map<String,Object> params) throws BlogException;

    /**
     * 查询所有用户
     * @return
     */
    public List<Users> AllUsersList();

    /**
     * 根据用户id查询
     * @param params
     * @return
     */
    public Users findUsersById(Map<String,Object> params);

    /**
     * 查询登陆用户
     * @param params
     * @return
     */
    public Users findLogin(Map<String,Object> params);

}
