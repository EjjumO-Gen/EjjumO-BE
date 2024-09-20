package com.ejjumo.user.service;

import com.ejjumo.user.dao.UserDAO;
import com.ejjumo.user.dto.User;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public int register(User user) throws SQLException {
        return userDAO.insert(user);
    }

    public User findUser(int userId) throws SQLException {
        return userDAO.select(userId);
    }

    public User findUserByKakaoId(String kakaoId) throws SQLException {
        return userDAO.selectByKakaoId(kakaoId);
    }

    public List<User> findAllUsers() throws SQLException {
        return userDAO.selectAll();
    }
}
