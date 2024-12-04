package web.PP_3_1_1.service;


import web.PP_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> showUsers();

    User getUser(Long id);

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);
}
