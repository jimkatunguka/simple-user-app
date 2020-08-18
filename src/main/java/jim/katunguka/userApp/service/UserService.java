package jim.katunguka.userApp.service;

import jim.katunguka.userApp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> getAll();

    public User getUser(String userId);

    public User createUser(User user);

    public User updateUser(String userId,User new_User);

    public void deleteUser(String userId);
}
