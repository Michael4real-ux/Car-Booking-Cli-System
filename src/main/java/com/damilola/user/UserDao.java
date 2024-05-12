package com.damilola.user;

import java.util.List;
import java.util.UUID;

public interface UserDao {
    User getUserId(UUID id);

    List<User> getUsers();
}
