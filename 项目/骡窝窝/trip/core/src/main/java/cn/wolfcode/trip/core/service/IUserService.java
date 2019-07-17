package cn.wolfcode.trip.core.service;

import cn.wolfcode.trip.core.domain.User;

public interface IUserService {
    public void register(User user, String verifyCode);

    User login(String account, String password);

    void update(User user);

    User listUser(Long id);
}
