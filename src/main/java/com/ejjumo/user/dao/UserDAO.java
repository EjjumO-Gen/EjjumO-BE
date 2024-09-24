package com.ejjumo.user.dao;

import com.ejjumo.user.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface UserDAO {
    public int insert(User user) throws SQLException;
    public int update(User user) throws SQLException;
    public int delete(int userId) throws SQLException;

    public User select(int userId) throws SQLException;
    public User selectByKakaoId(String kakaoId) throws SQLException;
    public List<User> selectAll() throws SQLException;
}
