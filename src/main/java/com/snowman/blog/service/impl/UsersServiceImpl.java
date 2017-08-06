package com.snowman.blog.service.impl;

import com.snowman.blog.dao.UsersMapper;
import com.snowman.blog.model.Users;
import com.snowman.blog.service.UsersService;
import com.snowman.blog.utils.BlogException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SnowMan on 2017/7/14.
 */
@Service
public class UsersServiceImpl implements UsersService {

    private static Logger logger = Logger.getLogger(UsersServiceImpl.class);

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean saveUsers(Users users) throws BlogException {
        Map<String, Object> params = new HashMap<String, Object>();
        List<Throwable> causes = new ArrayList<Throwable>();
        boolean isSave = false;
        if(users != null){
            if(null == users.getUserName() || "".equals(users.getUserName())){
                causes.add(new BlogException("用户名不能为空"));
            }
            if(null == users.getPassword() || "".equals(users.getPassword())){
                causes.add(new BlogException("密码不能为空"));
            }
            if(null == users.getNickName() || "".equals(users.getNickName())){
                causes.add(new BlogException("昵称不能为空"));
            }
            if(null == users.getEmail() || "".equals(users.getEmail())){
                causes.add(new BlogException("邮箱不能为空"));
            }

            if(causes.size() > 0)
                throw new BlogException(causes);
        }
        params.put("users", users);
        isSave = usersMapper.saveRecord(params) > 0 ? true : false;
        return isSave;
    }

    @Override
    public int updateUsers(Users users) throws BlogException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("users", users);
        return usersMapper.updateRecord(params);
    }

    @Override
    public int deleteUsers(int id) throws BlogException{
        return 0;
    }

    @Override
    public List<Users> AllUsersList() {
        return null;
    }

    @Override
    public Users findUsersById(int id) {
        return null;
    }

    @Override
    public Users findLogin(Users users) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("users", users);
        return usersMapper.findLogin(params);
    }
}
