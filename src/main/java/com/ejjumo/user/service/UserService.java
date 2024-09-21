package com.ejjumo.user.service;

import com.ejjumo.user.dto.User;
import com.ejjumo.user.dto.UserPlaylist;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public int register(User user) throws SQLException;
    public UserPlaylist findUser(int userId) throws SQLException;
    public User findUserByKakaoId(String kakaoId) throws SQLException;
    public List<User> findAllUsers() throws SQLException;
}
