package com.evoteam.eatsave.api.service;

import com.evoteam.eatsave.api.domain.models.Role;
import com.evoteam.eatsave.api.domain.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}