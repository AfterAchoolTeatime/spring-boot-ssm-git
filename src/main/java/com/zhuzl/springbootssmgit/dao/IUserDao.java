package com.zhuzl.springbootssmgit.dao;

import com.zhuzl.springbootssmgit.pojo.MUser;

public interface IUserDao {

    int countUserName(MUser mUser);

    boolean addUser(MUser mUser);

    MUser getUserByName(String userName);

    MUser getUserById(String id);

    boolean updateUser(MUser mUser);

    boolean deleteUser(String id);
}
