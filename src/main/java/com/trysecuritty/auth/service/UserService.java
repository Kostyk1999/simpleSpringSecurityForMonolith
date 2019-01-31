package com.trysecuritty.auth.service;

import com.trysecuritty.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
