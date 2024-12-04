package web.PP_3_1_1.dao;


import web.PP_3_1_1.model.User;

import java.util.List;

public interface UserDAO {
    List<User> showUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUser(Long id);
}
