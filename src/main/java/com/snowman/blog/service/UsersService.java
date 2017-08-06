package com.snowman.blog.service;

import com.snowman.blog.model.Users;
import com.snowman.blog.utils.BlogException;

import java.util.List;

/**
 * Created by SnowMan on 2017/7/14.
 */
public interface UsersService {

    /**
     * 保存用户
     * @param users
     * @return
     */
    public boolean saveUsers(Users users) throws BlogException;

    /**
     * 更新用户
     * @param users
     * @return
     */
    public int updateUsers(Users users) throws BlogException;

    /**
     * 删除用户
     * @param id
     * @return
     */
    public int deleteUsers(int id) throws BlogException;

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
    public Users findUsersById(int id);

    /**
     * 查询登陆用户
     * @param params
     * @return
     */
    public Users findLogin(Users users);
}
