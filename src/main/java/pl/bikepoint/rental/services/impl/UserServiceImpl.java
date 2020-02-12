package pl.bikepoint.rental.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bikepoint.rental.dao.contract.User;
import pl.bikepoint.rental.repository.UserRepository;
import pl.bikepoint.rental.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userrepository;

    @Autowired
    public UserServiceImpl(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    @Override
    public void deleteUserById(Long Id) {
        User user=userrepository.findById(Id).orElseThrow(IllegalAccessError::new);
        userrepository.delete(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userrepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userrepository.save(user);
    }
}
