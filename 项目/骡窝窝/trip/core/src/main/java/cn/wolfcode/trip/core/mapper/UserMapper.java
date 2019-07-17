package cn.wolfcode.trip.core.mapper;

import cn.wolfcode.trip.core.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User selectByPhone(String phone);

    User selectByAccountAndPassword(@Param("account") String account, @Param("password") String password);

    User selectByUserId(Long id);
}