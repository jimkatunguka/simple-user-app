package jim.katunguka.userApp.service;

import jim.katunguka.userApp.model.User;
import jim.katunguka.userApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements  UserService{

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
       return userRepository.findAll();
    }

    public User getUser(String userId){
        return userRepository.findById(userId).get();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String userId,User new_User){
        User user = userRepository.findById(userId).get();

        user.setFirstName(new_User.getFirstName());
        user.setLastName(new_User.getLastName());
        user.setDob(new_User.getDob());
        user.setAddress(new_User.getAddress());

        return userRepository.save(user);
    }

    public void deleteUser(String userId){
        User user = userRepository.findById(userId).get();
        userRepository.delete(user);
    }
}
